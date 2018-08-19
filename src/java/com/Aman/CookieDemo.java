/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Aman;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aman Nautiyal
 */
public class CookieDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp);
    }
    protected void doGetPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
     response.setContentType("text/html");
     String name=request.getParameter("name");
     String sports=request.getParameter("sports");  
     Cookie c1=new Cookie("name", name);
     Cookie c2=new Cookie("sports",sports);
     response.addCookie(c1);
     response.addCookie(c2);
     try(PrintWriter out=response.getWriter())
     {
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cookie Demo 1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Name : " + name + "</h2>");
            out.println("<h2>Sport : " + sports + "</h2>");
            out.println("<hr>");
            out.println("<a href=\"cd2\">View Topics</a>");
            out.println("</body>");
            out.println("</html>");
     }
     
    }
}
