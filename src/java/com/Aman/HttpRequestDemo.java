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
public class HttpRequestDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp);//To change body of generated methods, choose Tools | Templates.
    }

    protected void doGetPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
      resp.setContentType("text/html");
      PrintWriter pw=resp.getWriter();
      pw.println("<h1>This message is from httpServlet</h1>");
    }

}
