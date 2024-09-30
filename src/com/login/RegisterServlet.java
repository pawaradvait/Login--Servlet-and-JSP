package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
 
		String username=req.getParameter("username");
		String password = req.getParameter("password");
		LoginDao dao = new LoginDao();
		boolean register = dao.createUser(username, password);
		if(register) {
			resp.sendRedirect("Login.html");
		}else {
			PrintWriter out = resp.getWriter();
			out.println("error");
		}
		
		
	}

}
