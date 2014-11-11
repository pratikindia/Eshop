package com.infotop.eshop.activities;

import com.infotop.eshop.R;


import com.infotop.eshop.adapters.ExpandableListAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;


import android.widget.ExpandableListView;



 
public class EshopPoliciesActivity extends Activity {
 
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eshop_policies);
 
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
 
        // preparing list data
        prepareListData();
 
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
 
        // setting list adapter
        expListView.setAdapter(listAdapter);
 
     
    }
 
    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
 
        // Adding child data
        listDataHeader.add("Terms Of Use");
        listDataHeader.add("Privacy Policy");
        listDataHeader.add("Affiliate Policy");
 
        // Adding child data
        List<String> termOfUse = new ArrayList<String>();
        termOfUse.add("This document is an electronic record in terms of Information Technology Act, " +
        		"2000 and rules there under as applicable and the amended provisions pertaining to electronic records in various statutes as amended by the Information Technology Act, 2000. " +
        		"This electronic record is generated by a computer system and does not require any physical or digital signatures. This document is published in accordance with the provisions of Rule 3 (1) of the Information Technology (Intermediaries guidelines) Rules," +
        		" 2011 that require publishing the rules and regulations, privacy policy and Terms of Use for access or usage of www.flipkart.com website." +
        		"The domain name www.flipkart.com (hereinafter referred to as Website) is owned by Flipkart Internet Private Limited a company incorporated under the Companies Act, " +
        		"1956 with its registered office at Vaishnavi Summit, Ground Floor, 7th Main, 80 feet Road, 3rd Block, Koramangala Industrial Layout, Next to Wipro office, Corporation Ward No. 68, Koramangala, Bangalore - 560 034, Karnataka, India (hereinafter referred to as Flipkart)." +
        		"Your use of the Website and services and tools are governed by the following terms and conditions (Terms of Use) as applicable to the Website including the applicable policies which are incorporated herein by way of reference." +
        		" If You transact on the Website, You shall be subject to the policies that are applicable to the Website for such transaction. By mere use of the Website, You shall be contracting with Flipkart Internet Private Limited and these terms and conditions including the policies constitute Your binding obligations," +
        		" with Flipkart.For the purpose of these Terms of Use, wherever the context so requires You or User shall mean any natural or legal person who has agreed to become a buyer on the Website by providing Registration Data while registering on the Website as Registered User using the computer systems. Flipkart allows the User to surf the Website or making purchases without registering on the Website. " +
        		"The term We, Us, Our shall mean Flipkart Internet Private Limited.When You use any of the services provided by Us through the Website, including but not limited to, (e.g. Product Reviews, Seller Reviews), You will be subject to the rules, guidelines, policies, terms, and conditions applicable to such service, and they shall be deemed to be incorporated into this Terms of Use and shall be considered as part and parcel of this Terms of Use." +
        		" We reserve the right, at Our sole discretion, to change, modify, add or remove portions of these Terms of Use, at any time without any prior written notice to You." +
        		" It is Your responsibility to review these Terms of Use periodically for updates / changes. Your continued use of the Website following the posting of changes will mean that You accept and agree to the revisions. As long as You comply with these Terms of Use, We grant You a personal, non-exclusive, non-transferable, limited privilege to enter and use the Website.ACCESSING, BROWSING OR OTHERWISE USING THE SITE INDICATES YOUR AGREEMENT TO ALL THE TERMS AND CONDITIONS UNDER THESE TERMS OF USE, " +
        		"SO PLEASE READ THE TERMS OF USE CAREFULLY BEFORE PROCEEDING." +
        		" By impliedly or expressly accepting these Terms of Use, " +
        		"You also accept and agree to be bound by Flipkart Policies ((including but not limited to Privacy Policy available on /s/privacypolicy) as amended from time to time.Membership EligibilityUse of the Website is available only to persons who can form legally binding contracts under Indian Contract Act, 1872." +
        		" Persons who are incompetent to contract within the meaning of the Indian Contract Act, 1872 including minors, un-discharged insolvents etc. are not eligible to use the Website. If you are a minor i.e. under the age of 18 years, you shall not register as a User of the Flipkart website and shall not transact on or use the website. As a minor if you wish to use or transact on website, such use or transaction may be made by your legal guardian or parents on the Website." +
        		" Flipkart reserves the right to terminate your membership and / or refuse to provide you with access to the Website if it is brought to Flipkart's notice or if it is discovered that you are under the age of 18 years.Your Account and Registration ObligationsIf You use the Website, You shall be responsible for maintaining the confidentiality of your Display Name and Password and You shall be responsible for all activities that occur under your Display Name and Password." +
        		" You agree that if You provide any information that is untrue, inaccurate, not current or incomplete or We have reasonable grounds to suspect that such information is untrue, inaccurate, not current or incomplete, or not in accordance with the this Terms of Use, We shall have the right to indefinitely suspend or terminate or block access of your membership on the Website and refuse to provide You with access to the Website.CommunicationsWhen You use the Website or send emails or other data," +
        		" information or communication to us, You agree and understand that You are communicating with Us through electronic records and You consent to receive communications via electronic records from Us periodically and as and when required. We may communicate with you by email or by such other mode of communication, electronic or otherwise.Platform for Transaction and CommunicationThe Website is a platform that Users utilize to meet and interact with one another for their transactions." +
        		" Flipkart is not and cannot be a party to or control in any manner any transaction between the Website's Users."+
        		"Henceforward:"+
               "1. All commercial/contractual terms are offered by and agreed to between Buyers and Sellers alone. The commercial/contractual terms include without limitation price, shipping costs, payment methods, payment terms, date, period and mode of delivery, warranties related to products and services and after sales services related to products and services. Flipkart does not have any control or does not determine or advise or in any way involve itself in the offering or acceptance of such commercial/contractual terms between the Buyers and Sellers.");
        
 
        List<String> privacyPolicy = new ArrayList<String>();
        privacyPolicy.add("Privacy Policy"+
        "We value the trust you place in us. That is why we insist upon the highest standards for secure transactions and customer information privacy. Please read the following statement to learn about our information gathering and dissemination practices."+
        		"Our privacy policy is subject to change at any time without notice"+"To make sure you are aware of any changes, please review this policy periodically."+
        "By visiting this Website you agree to be bound by the terms and conditions of this Privacy Policy. If you do not agree please do not use or access our Website."+
        		"By mere use of the Website, you expressly consent to our use and disclosure of your personal information in accordance with this Privacy Policy. This Privacy Policy is incorporated into and subject to the Terms of Use."+
        "1. Collection of Personally Identifiable Information and other Information"+"When you use our Website, we collect and store your personal information which is provided by you from time to time. Our primary goal in doing so is to provide you a safe, efficient, smooth and customized experience. This allows us to provide services and features that most likely meet your needs, and to customize our Website to make your experience safer and easier. More importantly, while doing so we collect personal information from you that we consider necessary for achieving this purpose."+
"In general, you can browse the Website without telling us who you are or revealing any personal information about yourself. Once you give us your personal information, you are not anonymous to us. Where possible, we indicate which fields are required and which fields are optional. You always have the option to not provide information by choosing not to use a particular service or feature on the Website. We may automatically track certain information about you based upon your behaviour on our Website. We use this information to do internal research on our users"+
        
"demographics, interests, and behaviour to better understand, protect and serve our users. This information is compiled and analysed on an aggregated basis. This information may include the URL that you just came from (whether this URL is on our Website or not), which URL you next go to (whether this URL is on our Website or not), your computer browser information, and your IP address."+
"We use data collection devices such as cookies on certain pages of the Website to help analyse our web page flow, measure promotional effectiveness, and promote trust and safety. Cookies are small files placed on your hard drive that assist us in providing our services. We offer certain features that are only available through the use of a cookie."+
"We also use cookies to allow you to enter your password less frequently during a session. Cookies can also help us provide information that is targeted to your interests. Most cookies are session cookies, meaning that they are automatically deleted from your hard drive at the end of a session. You are always free to decline our cookies if your browser permits, although in that case you may not be able to use certain features on the Website and you may be required to re-enter your password more frequently during a session."+
"Additionally, you may encounter cookies  or other similar devices on certain pages of the Website that are placed by third parties. We do not control the use of cookies by third parties."+
"If you choose to buy on the Website, we collect information about your buying behaviour."+
"If you transact with us, we collect some additional information, such as a billing address, a credit / debit card number and a credit / debit card expiration date and/ or other payment instrument details and tracking information from cheques or money orders."+
"If you choose to post messages on our message boards, chat rooms or other message areas or leave feedback, we will collect that information you provide to us. We retain this information as necessary to resolve disputes, provide customer support and troubleshoot problems as permitted by law."+
"If you send us personal correspondence, such as emails or letters, or if other users or third parties send us correspondence about your activities or postings on the Website, we may collect such information into a file specific to you.");
        
 
        List<String> affiliatePolicy = new ArrayList<String>();
        affiliatePolicy.add("Flipkart is committed to removing infringing products from the site. To facilitate this, Flipkart has put in place a Flipkart Infringement Verification process so that intellectual property owners could easily report listings that infringe their rights. It is in Flipkart's interest to ensure that infringing products are removed from the site, as they erode Buyer and Seller trust.Policy"+
"Flipkart respects third party Intellectual Property rights and actively supports protection of all third party Intellectual Property including Copyrights and Trademarks (IP). It is our policy to expeditiously respond to clear notices of alleged IP infringement.If we receive proper notification of IP infringement, our response to such notices will include removing or disabling access to material claimed to be the subject of infringing activity. For a detailed term of use of our website, please visit http://www.flipkart.com/s/terms"+
"How to report a listing"+
"If you have a good faith belief that your IP right has been infringed by any of our sellers, you may follow the below process: We require that the Intellectual Property right owner or authorized agent provide the following details and email it to infringement@flipkart.com.The email should contain the below information."+
"Identification or description of the copyrighted work/ trademark that has been infringed."+
"Clear identification or description of where the material that you claim is infringing is located on www.flipkart.com with adequate particulars. Product ID / website links of infringing products (in case of copyright infringement)"+
   "(Note: Flipkart is unable to process requests which do not specify exact product IDs or URLs. Please do not provide links to browse pages or links of search queries as these pages are dynamic and their contents change with time)."+
"Your address, telephone number, and email address."+
"A statement by you that you have a good faith belief that the use of the material complained of is not authorized by the copyright or intellectual property owner, its agent, or the law."+
"A statement by you, that the information in your notice is accurate and that you are the copyright or intellectual property owner or authorized to act on the copyright or intellectual property owner's behalf.Brand Name (in case of Trademark infringement)"+
"Details of the intellectual property being infringed (Provide copyrighted images or trademark certificates as attachments)");
        
 
        listDataChild.put(listDataHeader.get(0), termOfUse); // Header, Child data
        listDataChild.put(listDataHeader.get(1), privacyPolicy);
        listDataChild.put(listDataHeader.get(2), affiliatePolicy);
    }
}