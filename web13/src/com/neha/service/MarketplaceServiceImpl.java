package com.neha.service;

import com.neha.domain.*;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import ravi.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.neha.bin.copy.Create1;
import com.neha.dao.*;
import com.neha.bin.*;

public class MarketplaceServiceImpl {
	
	
	 public void addPartner(Create mypojo){
		 
		 MarketplaceDaoImplements ob = new MarketplaceDaoImplements();
	        try {
				ob.MarketplaceDaoInsert(mypojo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	 }
public boolean accountExists(Create mypojo){
		 
		 MarketplaceDaoImplements ob = new MarketplaceDaoImplements();
	       boolean flag=false;
				try {
					flag= ob.ifalreadyexist(mypojo);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			return flag;

	 }

		public boolean accountExists1(Create1 mypojo){
	 
	 MarketplaceDaoImplements ob = new MarketplaceDaoImplements();
      boolean flag=false;
			try {
				flag= ob.ifalreadyexist1(mypojo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return flag;
}



 public void delPartner(Create1 mypojo) throws Exception{
		 
		 MarketplaceDaoImplements ob = new MarketplaceDaoImplements();
	        try {
				ob.MarketplaceDaoDelete(mypojo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	 }

}
