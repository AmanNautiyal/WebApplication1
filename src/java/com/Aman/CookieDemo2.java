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
public class CookieDemo2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp);
    }
    protected void doGetPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
      response.setContentType("text/html");
      String name="",sports="";
      Cookie[] arr =request.getCookies();
      if(arr==null)
          response.sendRedirect("Cookie1.html");
      else
      {
       for(Cookie i:arr)
       {
        if(i.getName().equals("name"))
            name=i.getValue();
        if(i.getName().equals("sports"))
            sports=i.getValue();
       }
      }
       try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet CookieServlet1</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h2>Name : " + name + "</h2>");
                out.println("<h2>Sport : " + sports + "</h2>");
                out.println("<hr>");
                out.println("<ol>");
                switch (sports) {
                    case "cricket":case "tennis":case "football":
                        out.println("<li>Outdoor Game</li>");
                        
                        break;
                   case "table tennis":case"badminton":
                        out.println("<li>Indoor Game</li>");
                        break;
                }
                out.println("</ol>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
