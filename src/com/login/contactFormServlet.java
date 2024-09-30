package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contact")
public class contactFormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
  
		String name12 = req.getParameter("name").toString();
		System.out.println(name12);
		if(name12 !=null) {
			System.out.println("entered");
			RequestDispatcher rd = req.getRequestDispatcher("contact.jsp");
			rd.forward(req, resp);
		}else {
			System.out.println(" no entered");

		req.setAttribute("success", "sucess");
		RequestDispatcher rd = req.getRequestDispatcher("contact.jsp");
		rd.forward(req, resp);
		}
	}
}
