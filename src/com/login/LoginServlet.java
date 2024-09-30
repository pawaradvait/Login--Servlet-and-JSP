package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out =  resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		LoginDao dao = new LoginDao();
		if(dao.check(username, password)) {
		out.println(username);
		HttpSession session = req.getSession();
		session.setAttribute("namey", username);
		if(session.getAttribute("namey") != null) {
			resp.sendRedirect("Welcome.jsp");
		}}else {
			out.println("error page ");
		}
		
	}

}
