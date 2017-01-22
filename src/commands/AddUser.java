package commands;

import java.io.IOException;
import java.lang.Math;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;
import servlet.Dispatcher;
import dao.DaoFactory;

public class AddUser extends Dispatcher{
	
	private static final long serialVersionUID = 1L;
	private static final String LOGIN= "login";
	private static final String PASSWORD = "password";

	
	public AddUser(){
		super();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter(LOGIN);
		String password = request.getParameter(PASSWORD);
		try{
			 if (DaoFactory.newUser().find(login)) {
				 this.forward("/success.jsp", request, response);
			 }
			 else{
			int e = password.hashCode();
			int a = -1000 + (int)(Math.random()*(2001));
			int b = -1000 + (int)(Math.random()*(2001));
			int c = -1000 + (int)(Math.random()*(2001));
			int d = -1000 + (int)(Math.random()*(2001));
			
			int p02 = (int) (a*Math.pow(x2, 4) + b*Math.pow(x2, 3) + c*Math.pow(x2, 2) + d*x2 + e);
			int p03 = (int) (a*Math.pow(x3, 4) + b*Math.pow(x3, 3) + c*Math.pow(x3, 2) + d*x3 + e);
			int p04 = (int) (a*Math.pow(x4, 4) + b*Math.pow(x4, 3) + c*Math.pow(x4, 2) + d*x4 + e);
			int p05 = (int) (a*Math.pow(x5, 4) + b*Math.pow(x5, 3) + c*Math.pow(x5, 2) + d*x5 + e);
			int p06 = (int) (a*Math.pow(x6, 4) + b*Math.pow(x6, 3) + c*Math.pow(x6, 2) + d*x6 + e);
			int checksum0 = p02^p03^p04^p05^p06;
			String p2 = Integer.toString(p02);
			String p3 = Integer.toString(p03);
			String p4 = Integer.toString(p04);
			String p5 = Integer.toString(p05);
			String p6 = Integer.toString(p06);
			String checksum = Integer.toString(checksum0);
			DaoFactory.newUser().addUser(login, checksum, p2, p3, p4, p5, p6);
	        HttpSession session = request.getSession(true);
	        session.setAttribute("login", new String(login));
		}
		}
		catch(NamingException ex){
		 ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        this.forward("/success.jsp", request, response);
	}
}
