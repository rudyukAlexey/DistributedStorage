package commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.Dispatcher;

public class LogOut extends Dispatcher {
	private static final long serialVersionUID = 1L;

    public LogOut() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    	HttpSession session = request.getSession(false);  
    	session.invalidate();
    	this.forward("/index.jsp", request, response);
    }

}
