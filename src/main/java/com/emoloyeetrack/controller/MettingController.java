package com.emoloyeetrack.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emoloyeetreak.model.Alloence;
import com.emoloyeetreak.model.Meeting;
import com.employeetrack.daoimpl.dbconnection;



@WebServlet("/meeting")
public class MettingController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public dbconnection dc = new dbconnection();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RequestDispatcher rd = request.getRequestDispatcher("metting.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String place= request.getParameter("place");
		String company= request.getParameter("company");
		String time= request.getParameter("time");
		String date= request.getParameter("date");
		
		Meeting m=new Meeting();
		m.setPlace(place);
		m.setCompany(company);
		m.setTime(time);
		m.setDate(date);
		try {
			dc.meetingdao(m);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}

}