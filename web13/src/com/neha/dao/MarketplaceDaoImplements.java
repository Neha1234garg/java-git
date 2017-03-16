package com.neha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import com.neha.bin.Create;
import com.neha.bin.copy.Create1;
import ravi.util.*;



public class MarketplaceDaoImplements { 
	
	public void MarketplaceDaoInsert(Create mypojo) throws SQLException{
		
//	    String baseurl =mypojo.getMarketplace().getPartner();
//       
//        String partner = mypojo.getMarketplace().getBaseUrl();
		
		System.out.println("****************"+mypojo.getMarketplace().getPartner());
		System.out.println("****************"+mypojo.getPayload().getCompany().getEmail());
		
        Connection conn = DBConnectionManager.getConnection();

        PreparedStatement pps = null;

        try {
            //pps = conn.prepareStatement("INSERT INTO PARTNER (Partner_Name)VALUES (?)");
        	System.out.println("****************before preparestatement");
        	
        	pps = conn.prepareStatement("INSERT INTO Developer (marketplace_partner,creator_firstName,creator_lastName,creator_email,company_name,company_website,company_email,creator_uuid)VALUES (?,?,?,?,?,?,?,?)");
        	
        	System.out.println("****************after preparestatement");
        	
        	
            System.out.println("Partner Data has been saved to databse");

        pps.setString(1,mypojo.getMarketplace().getPartner());
        pps.setString(2,mypojo.getCreator().getFirstName());
        pps.setString(3,mypojo.getCreator().getLastName());
        pps.setString(4,mypojo.getCreator().getEmail());
        pps.setString(5,mypojo.getPayload().getCompany().getName());
        pps.setString(6,mypojo.getPayload().getCompany().getWebsite());
        pps.setString(7,mypojo.getPayload().getCompany().getEmail());
        pps.setString(8,mypojo.getCreator().getUuid());

        pps.executeUpdate();

        System.out.println("Partner Data has been saved to databse");
        //conn.close();

        } catch (SQLException e) {
        	conn.close();
            e.printStackTrace();
            e.getMessage();
        }
        
    }
	public boolean ifalreadyexist(Create mypojo) throws SQLException{
		Connection conn = DBConnectionManager.getConnection();
		String str=mypojo.getCreator().getUuid();
        PreparedStatement pps = conn.prepareStatement("SELECT * FROM Developer WHERE creator_uuid = ? ");
		pps.setString(1, str);
		ResultSet rs=pps.executeQuery();
		if(rs!=null && rs.next())
		{
			//conn.close();
			return true;
		}
		//conn.close();
		return false;
			
	}
	
	
	public boolean ifalreadyexist1(Create1 mypojo) throws SQLException{
		Connection conn = DBConnectionManager.getConnection();
		String str=mypojo.getCreator().getUuid();
		System.out.println("conn se pehle");
        PreparedStatement pps = conn.prepareStatement("SELECT * FROM Developer WHERE creator_uuid = ? ");
		System.out.println("conn k baad");
		pps.setString(1, str);
		ResultSet rs=pps.executeQuery();
		if(rs!=null && rs.next())
		{
			//conn.close();
			return true;
		}
		//conn.close();
		return false;
			
	}
	
	
	
	
	public void MarketplaceDaoDelete(Create1 mypojo)throws ClassNotFoundException,SQLException{
		 Connection conn = DBConnectionManager.getConnection();
		 
	       Statement st=conn.createStatement();
	       String sql="DELETE FROM Developer WHERE creator_uuid = '"+mypojo.getCreator().getUuid()+"'";
	       st.executeUpdate(sql);
	       //conn.close();	      
	   }
//public void MarketplaceDaoDelete(Create1 mypojo) throws SQLException{
//		
////	    String baseurl =mypojo.getMarketplace().getPartner();
////       
////        String partner = mypojo.getMarketplace().getBaseUrl();
//		
//		//System.out.println("****************"+mypojo.getMarketplace().getPartner());
//		//System.out.println("****************"+mypojo.getPayload().getCompany().getEmail());
//		
//        Connection conn = DBConnectionManager.getConnection();
//
//        PreparedStatement pps = null;
//
//        try {
//        	pps = conn.prepareStatement("Delete from Developer where creator_uuid= "+mypojo.getCreator().getUuid());
//        	pps.executeUpdate();
//             //System.out.println("User with USER_ID :"+userId+" has been removed successfully");
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            e.getMessage();
//        }
//        finally {
//
//            try {
//                conn.close();
//            } catch (SQLException e) {
//            	e.getMessage();
//                e.printStackTrace();
//            }
//
//
//        }
//    }
	}


