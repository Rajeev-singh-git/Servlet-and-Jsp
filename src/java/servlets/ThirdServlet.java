package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ThirdServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
      System.out.println("this is get method..................");
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<h1> this is get method of Third servlet made using HttpServlet</h1>");
      
      
    } 
    
    
    
}
