package com.iluzanac.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletExample")
public class Servlet_Example extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*PrintWriter out = response.getWriter();
		
		if(  request.getParameter("firstname") == "null" ||  request.getParameter("lastname") == "null"      ){
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		return;
		}
		
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		
		out.println(firstName + "hfbhirgberigh" + lastName);*/

		
		
	}

}
