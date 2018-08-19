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
public class CurrencyConverter extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    protected void doGetPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        float r=Float.parseFloat(request.getParameter("rup"));
        int c=Integer.parseInt(request.getParameter("choice"));
        PrintWriter out=response.getWriter();
        switch(c)
        {
            case 1:
                r*=0.016;out.println("<h2>"+r+"dollars</h2>");break;
            case 2:
                r*=0.01352;out.println("<h2>"+r+"Euros</h2>");break;
            case 3:
                r*=0.01205;out.println("<h2>"+r+"Pounds</h2>");break;
        }
        out.close();
    }
    
}
