package com.jayson.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.jayson.Dao.UserDAO;
import com.jayson.Model.User;

@WebServlet("/register")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDAO userDAO;

    public UserController() {
        super();
      
    }
    public void init() {
    	userDAO = new UserDAO();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			register(request, response);

	}
	
	public void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			User student = new User();
			
			student.setFirstname(firstname);
			student.setLastname(lastname);
			student.setUsername(username);
			student.setPassword(password);
			
			try {
				
				int result = userDAO.registerStudent(student);
				
				if(result == 1) {
					request.setAttribute("NOTIFICATION", "User Register Succesfully");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
			dispatcher.forward(request, response);
		
	}

}
