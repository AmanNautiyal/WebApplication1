package com.Aman;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aman Nautiyal
 */
public class TableGen extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp);
    }
    protected void doGetPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
    {
      PrintWriter out=resp.getWriter();
      long num=Long.parseLong(req.getParameter("num"));
      out.println("<h2>THe table is as follows:</h2>");
      out.println("<ul>");
      for(int i=1;i<=10;i++)
      {
       out.println("<li>"+num+" X "+i+" = "+(num*i)+"</li>");
      }
      out.close();
    }

}
