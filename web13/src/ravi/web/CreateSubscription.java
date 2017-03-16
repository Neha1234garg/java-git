package ravi.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.neha.bin.*;
import com.neha.dao.MarketplaceDao;
import com.neha.dao.MarketplaceDaoImplements;
import com.neha.service.MarketplaceServiceImpl;
import com.neha.util.common;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import ravi.model.User;

/**
 * Servlet implementation class Create
 */
@WebServlet("/CreateSubscription")
public class CreateSubscription extends HttpServlet {
	static MarketplaceDaoImplements marketplacedao;
	//private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json");
        PrintWriter out=response.getWriter();
        String eventUrl=(String)request.getParameter("eventUrl");
//        SendResponse demo=new SendResponse();
//        
//        try {
//            out.print(demo.SuccessResponse(response, "Hello Meena"));
//        } catch (Exception e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
        common httpconn=new common();
       // SendResponse responsenew=new SendResponse();
        
        try{
        HttpURLConnection http=httpconn.signauth(eventUrl);
        String json=httpconn.getJsonStringfromInputstream(http);
        System.out.println(json);
        Create mainbean=httpconn.mapppingJsontobeans(json);
        MarketplaceServiceImpl service=new MarketplaceServiceImpl();
        boolean flag=service.accountExists(mainbean);
        
        if(flag==false){
        	
            service.addPartner(mainbean);
            System.out.print("####"+httpconn.SuccessResponse(response,mainbean.getCreator().getUuid()));
            out.print(httpconn.SuccessResponse(response,mainbean.getCreator().getUuid()));
        }
        else{
        	System.out.println("failure");
            //out.print(httpconn.FailureResponse(response,mainbean.getCreator().getUuid()));
        }
    }
catch(Exception e){
    e.printStackTrace();
}

}
}
