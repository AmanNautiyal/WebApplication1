/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Aman;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Aman Nautiyal
 */
public class ServletDemo implements Servlet{
    ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
    this.config=config;
    }

    @Override
    public ServletConfig getServletConfig() {
     return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    out.println("<h1>This message is from servlet</h1>");
    }

    @Override
    public String getServletInfo() {
           return config.toString();
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
