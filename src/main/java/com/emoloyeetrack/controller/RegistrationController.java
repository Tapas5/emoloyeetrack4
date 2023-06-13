package com.emoloyeetrack.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emoloyeetreak.model.Alloence;
import com.emoloyeetreak.model.Registration;
import com.employeetrack.daoimpl.dbconnection;


@WebServlet("/reg")
public class RegistrationController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public dbconnection dc = new dbconnection();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname=request.getParameter("fullname");
		String employeeid =request.getParameter("employeeid");
		String mobile=request.getParameter("mobile");
		String designation=request.getParameter("designation");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		Registration r = new Registration();
		r.setFullname(fullname);
		r.setEmployeeid(employeeid);
		r.setMobile(mobile);
		r.setDesignation(designation);
		r.setEmail(email);
		r.setPassword(password);
		
		try {
			dc.registrationdao(r);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}

}