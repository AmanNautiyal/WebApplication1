/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Aman;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aman Nautiyal
 */
public class FactGen extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req,resp); 
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req,resp)
        ;    }
    protected void doGetPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
     int num=Integer.parseInt(request.getParameter("num"));
     PrintWriter out=response.getWriter();
     long fact=1;
     for(int i=1;i<=num;i++)
         fact=fact*i;
     out.println("<h2>The factorial of the number is:"+fact+"</h2>");
    }
}
