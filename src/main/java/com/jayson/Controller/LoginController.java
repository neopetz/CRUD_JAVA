package com.jayson.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.jayson.Dao.LoginDAO;
import com.jayson.Model.LoginModel;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    LoginDAO loginDAO;   
	
    public LoginController() {
        super();
    }
    public void init(){
    	loginDAO = new LoginDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginModel loginModel = new LoginModel();
		
		loginModel.setUsername(username);
		loginModel.setPassword(password);
		
		try {
			boolean result = loginDAO.validate(loginModel);
			
			if(result) {
				request.setAttribute("NOTIFICATION", "Login Successfully");
			}else {
				request.setAttribute("NOTIFICATION", "Failed");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
		dispatcher.forward(request, response);
		
	}

}
