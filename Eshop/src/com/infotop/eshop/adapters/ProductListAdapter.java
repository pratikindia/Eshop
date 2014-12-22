package com.infotop.eshop.adapters;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.infotop.eshop.R;
import com.infotop.eshop.activities.NoItemFoundActivity;
import com.infotop.eshop.db.DatabaseHandler;
import com.infotop.eshop.login.EshopLoginActivity;
import com.infotop.eshop.model.Wishlist;
import com.infotop.eshop.product.BookDetailsActivity;
import com.infotop.eshop.product.ProductListViewActivity;
import com.infotop.eshop.utilities.UserSessionManager;
import com.infotop.eshop.wishlist.WishListMainActivity;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

@SuppressLint({ "ViewHolder", "InflateParams", "SimpleDateFormat" })
public class ProductListAdapter extends ArrayAdapter<String> {

	private final Activity context;
	private final String[] productName;
	private final String[] desc;
	private final String[] imageUrl;
	private final String[] price;
	private final String[] pdctId;
	private final DisplayImageOptions op;
	protected ImageLoader loader = ImageLoader.getInstance();

	public ProductListAdapter(Activity context, String[] pdctId,
			String[] productName, String[] imageUrl, String[] desc,
			String[] price, DisplayImageOptions op) {

		super(context, R.layout.product_list, productName);
		this.context = context;
		this.productName = productName;
		this.imageUrl = imageUrl;
		this.desc = desc;
		this.price = price;
		this.pdctId = pdctId;
		this.op = op;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		View rowView = view;
		final ViewHolder holder;
		if (rowView == null) {
			rowView = context.getLayoutInflater().inflate(
					R.layout.product_list, parent, false);
			holder = new ViewHolder();
			holder.txtTitle = (TextView) rowView.findViewById(R.id.productName);
			holder.txtTitle1 = (TextView) rowView
					.findViewById(R.id.productDesc);
			holder.txtTitle2 = (TextView) rowView
					.findViewById(R.id.productprice);
			holder.imageView = (ImageView) rowView
					.findViewById(R.id.productImg);
			holder.imgwishlistbtn = (ImageView) rowView
					.findViewById(R.id.imgwishlistbtn);
			rowView.setTag(holder);
		} else {
			holder = (ViewHolder) rowView.getTag();
		}
		final int id = position;
		holder.txtTitle.setText(productName[position]);
		holder.txtTitle1.setText(desc[position]);
		holder.txtTitle2.setText(price[position]);
		loader.displayImage(imageUrl[position], holder.imageView, op, null);
		holder.imgwishlistbtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				UserSessionManager usMgr = new UserSessionManager(context);
				 if(usMgr.isUserLoggedIn()){
				DatabaseHandler db = new DatabaseHandler(context);
				Wishlist w = new Wishlist();
				w.setProductId(pdctId[id]);
				w.setProductName(productName[id]);
				w.setDescription(desc[id]);
				w.setPrice(price[id]);
				w.setImageUrl(imageUrl[id]);
				w.setCreatedDate(new SimpleDateFormat("dd MMM yyyy")
						.format(new Date()));
			
				List<Wishlist> s = db.getAllWishListItems();
				int counter=0;
				for(int i=0;i<s.size();i++){
					if(s.get(i).getProductId().equals(pdctId[id])){
						counter++;
					}
				}
				if(counter>0){
					Toast.makeText(context, "Your item is already added to Wish List",
							Toast.LENGTH_SHORT).show();
				}else{
					
					db.addWishList(w);
				Toast.makeText(context, "Your item is added to Wish List",
						Toast.LENGTH_SHORT).show();
					
				}
				
			}else{
					 Intent intent = new Intent(context,EshopLoginActivity.class);
						context.startActivity(intent);
					
				 }
			}
		});
		return rowView;

	}

	private class ViewHolder {
		public TextView txtTitle;
		public TextView txtTitle1;
		public TextView txtTitle2;
		public ImageView imageView;
		public ImageView imgwishlistbtn;
	}
}