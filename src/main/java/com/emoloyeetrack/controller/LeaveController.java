package com.emoloyeetrack.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emoloyeetreak.model.Alloence;
import com.emoloyeetreak.model.Leave;
import com.employeetrack.daoimpl.dbconnection;


@WebServlet("/leave")
public class LeaveController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public dbconnection da = new dbconnection();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RequestDispatcher rd = request.getRequestDispatcher("leaveapplication.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String from_date=request.getParameter("from_date");
		String to_date=request.getParameter("to_date");
		String empreason=request.getParameter("empreason");
		
		Leave l=new Leave();
		l.setName(name);
		l.setFrom_date(from_date);
		l.setTo_date(to_date);
		l.setEmpreason(empreason);
		try {
			da.leavedao(l);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}

}
