package com.neha.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.neha.bin.Create;
import com.neha.bin.copy.Create1;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import ravi.model.User;


public class common {
	
	public HttpURLConnection signauth(String eventUrl) throws Exception 
	{
		OAuthConsumer consumer = new DefaultOAuthConsumer("smiley-152819", "Q3BX3swaHCsWca25");
        URL url = new URL(eventUrl);
    	System.out.println("Done 1");
    	HttpURLConnection req = (HttpURLConnection) url.openConnection();
        req.setRequestProperty("Accept", "application/json");
        consumer.sign(req);
        req.connect();
    	System.out.println("Auth Signed");
    	return req;
	}
	
public String getJsonStringfromInputstream(HttpURLConnection req)throws IOException{
    String json="";
try{
    InputStream input=req.getInputStream();
    InputStreamReader read=new InputStreamReader(input);
    BufferedReader br=new BufferedReader(read);
    String line=br.readLine();
    while(line!=null){
        json=json+line;
        line=br.readLine();
    }
    br.close();
}
catch(IOException e){
    e.printStackTrace();
}
return json;
}
public Create mapppingJsontobeans(String Json) throws Exception{
	Create mainbean=null;
    try{
    ObjectMapper mapper=new ObjectMapper();
     mainbean=mapper.readValue(Json,Create.class);
    
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return mainbean;
}
public Create1 mapppingJsontobeans1(String Json) throws Exception{
	Create1 mainbean=null;
    try{
    ObjectMapper mapper=new ObjectMapper();
     mainbean=mapper.readValue(Json,Create1.class);
    
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return mainbean;
}









public String SuccessResponse(HttpServletResponse response,String new_accountidentifier)throws Exception{
    String res=null;
    try{
    ObjectMapper mapper=new ObjectMapper();
    User object=new User(true,new_accountidentifier);
   
    res=mapper.writeValueAsString(object);
     
}
    catch(Exception e){
        e.printStackTrace();
    }
    return res;
}
public String FailureResponse(HttpServletResponse response,String new_accountidentifier)throws Exception{
    String res=null;
    try{
    ObjectMapper mapper=new ObjectMapper();
    User object=new User(false,new_accountidentifier);
    res=mapper.writeValueAsString(object);
     
}
    catch(Exception e){
        e.printStackTrace();
    }
    return res;
}
}
