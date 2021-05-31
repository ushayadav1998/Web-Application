package com.httpmethods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GETPOSTServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GETPOSTServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printwriter=response.getWriter();
		printwriter.print("welcome");
		String FirstName=request.getParameter("fname");
		printwriter.print(FirstName);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printwriter=response.getWriter();
		printwriter.print("welcome");
		String firstname=request.getParameter("fname");
		printwriter.print(firstname);
	}

}
