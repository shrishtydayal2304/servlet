package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;


//@WebServlet("/Login")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
//    public Login() {
//        super();
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		LoginDao dao= new LoginDao();//creating object of database
	if(dao.check(uname, pass))
//		if(uname.equals("shrishty") && pass.equals("Shrishty"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
		response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
			response.getWriter().println("incorrect credentials");
		}
		}
	
	
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}


