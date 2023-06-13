package com.employeetrack.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.emoloyeetreak.model.Alloence;
import com.emoloyeetreak.model.Leave;
import com.emoloyeetreak.model.Meeting;
import com.emoloyeetreak.model.Registration;

public class dbconnection {

	public int alloencedao(Alloence al) throws ClassNotFoundException {

		String inser_query = " INSERT INTO Travel" + "(id,amount,description)VALUES" + "(?,?,?)";
		int ans = 0;
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false",
					"root", "");
			PreparedStatement ps = con.prepareStatement(inser_query);
			ps.setInt(1, 0);
			ps.setString(2, al.getAmount());
			ps.setString(3, al.getDescription());

			System.out.println(ps);
			ans = ps.executeUpdate();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return ans;
		
	}
	
	
	
	
	
	
	
	public int meetingdao(Meeting m) throws ClassNotFoundException {

		String inser_query = " INSERT INTO meeting" + "(id,place,company,time,date)VALUES" + "(?,?,?,?,?)";
		int ans = 0;
		Class.forName("com.mysql.jdbc.Driver");
		try {
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false", "root", "");

			PreparedStatement ps = con.prepareStatement(inser_query);
			ps.setInt(1, 0);
			ps.setString(2,m.getPlace());
			ps.setString(3,m.getCompany());
			ps.setString(4,m.getTime());
			ps.setString(5,m.getDate());

			System.out.println(ps);
			ans = ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return ans;
		
	}
	
	
	
	
	
	
	
	public int leavedao(Leave l) throws ClassNotFoundException {

		String inser_query = " INSERT INTO empleave" + "(id,name,from_date,to_date,empreason)VALUES" + "(?,?,?,?,?)";
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false",
					"root", "");
			PreparedStatement ps = con.prepareStatement(inser_query);
			ps.setInt(1,0);
			ps.setString(2, l.getName());
			ps.setString(3, l.getFrom_date());
			ps.setString(4, l.getTo_date());
			ps.setString(5, l.getEmpreason());

			System.out.println(ps);
			result = ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	public int registrationdao(Registration r) throws ClassNotFoundException {

		String inser_query = " INSERT INTO registration" + "(id,fullname,employeeid,mobile,designation,email,password)VALUES" + "(?,?,?,?,?,?,?)";
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false",
					"root", "");
			PreparedStatement ps = con.prepareStatement(inser_query);
			ps.setInt(1,0);
			ps.setString(2, r.getFullname());
			ps.setString(3, r.getEmployeeid());
			ps.setString(4, r.getMobile());
			ps.setString(5, r.getDesignation());
			ps.setString(6, r.getEmail());
			ps.setString(7, r.getPassword());
			
			System.out.println(ps);
			result = ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;
		
	}
	
	
	
	
	
	
	
	

}