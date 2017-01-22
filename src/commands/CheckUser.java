package commands;

import java.io.IOException;
import java.util.Arrays;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.Dispatcher;
import dao.DaoFactory;
import arithmetic.LinearCalc;


public class CheckUser extends Dispatcher {
	private static final long serialVersionUID = 1L;
	private static final String LOGIN= "login";
	private static final String PASSWORD = "password";
       
    public CheckUser() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long time1 = System.currentTimeMillis();
		String login = request.getParameter(LOGIN);
		String password = request.getParameter(PASSWORD);
		
        try {
            if (DaoFactory.newUser().find(login)) {
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
    			String[] parts = DaoFactory.newUser().getPart(login);
    			int d2 = Integer.parseInt(parts[0]) - p02;
    			int d3 = Integer.parseInt(parts[1]) - p03;
    			int d4 = Integer.parseInt(parts[2]) - p04;
    			int d5 = Integer.parseInt(parts[3]) - p05;
    			int d6 = Integer.parseInt(parts[4]) - p06;
    			int[] result1 = LinearCalc.calcLinearSystem((int) Math.pow(x2, 4),(int)  Math.pow(x2, 3),(int)  Math.pow(x2, 2), x2,
    													   (int) Math.pow(x3, 4),(int)  Math.pow(x3, 3),(int)  Math.pow(x3, 2), x3,
    													   (int) Math.pow(x4, 4),(int)  Math.pow(x4, 3),(int)  Math.pow(x4, 2), x4,
    													   (int) Math.pow(x5, 4),(int)  Math.pow(x5, 3),(int)  Math.pow(x5, 2), x5,
    													   d2, d3, d4, d5);
    			int[] result2 = LinearCalc.calcLinearSystem((int) Math.pow(x6, 4),(int)  Math.pow(x6, 3),(int)  Math.pow(x6, 2), x6,
						   									(int) Math.pow(x3, 4),(int)  Math.pow(x3, 3),(int)  Math.pow(x3, 2), x3,
						   									(int) Math.pow(x4, 4),(int)  Math.pow(x4, 3),(int)  Math.pow(x4, 2), x4,
						   									(int) Math.pow(x5, 4),(int)  Math.pow(x5, 3),(int)  Math.pow(x5, 2), x5,
						   									d6, d3, d4, d5);
    			if(Arrays.equals(result1, result2)){
                HttpSession session = request.getSession(true);
                session.setAttribute("login", new String(login));
               
                this.forward("/success.jsp", request, response);
    			} else {
                	this.forward("/success.jsp", request, response);
                }
            }
            else {
            	this.forward("/success.jsp", request, response);
            }
            } catch(NamingException ex){
        			 ex.printStackTrace();
        			} catch (ClassNotFoundException e) {
        				e.printStackTrace();
        			}
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
	}
}