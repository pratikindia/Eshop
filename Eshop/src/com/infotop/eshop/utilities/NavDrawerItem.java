package com.infotop.eshop.utilities;

public class NavDrawerItem {
	
	private String title;
	//private int icon;
	//private String count = "0";
	// boolean to set visiblity of the counter
	//private boolean isCounterVisible = false;
	
	public NavDrawerItem(){}

	/*public NavDrawerItem(String title, int icon){
		this.title = title;
		//this.icon = icon;
	}*/
	
	public NavDrawerItem(String title){
		this.title = title;
	}
	
	/*public NavDrawerItem(String title, int icon, boolean isCounterVisible, String count){
		this.title = title;
		//this.icon = icon;
		this.isCounterVisible = isCounterVisible;
		this.count = count;
	}
	*/
	public String getTitle(){
		return this.title;
	}
			
	public void setTitle(String title){
		this.title = title;
	}

}
