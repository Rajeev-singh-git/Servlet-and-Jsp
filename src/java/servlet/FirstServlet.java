
package servlet;
import java.io.IOException;
import javax.servlet.*;

public class FirstServlet implements Servlet{

ServletConfig conf;

//LifeCycle Methods


@Override
//when server creates servlet object to inititialize that server will run this method
public void init(ServletConfig conf){
 this.conf= conf;
 System.out.println("Creating object");
}
    


@Override
//To process any upcoming request, server will run 'service' method
public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
 System.out.println("Servicing.......................");

}

@Override 
//When object will be getting destroyed than server will run destroy method
public void destroy(){
 System.out.println("going to destroy servlet object");
}
    
 
//non life cycle methods
// These method will run only when we call the

@Override 
public ServletConfig getServletConfig()
{
    return this.conf;
}

@Override
public String getServletInfo(){
  return "this servlet is created by Rajeev Singh";
}


}
