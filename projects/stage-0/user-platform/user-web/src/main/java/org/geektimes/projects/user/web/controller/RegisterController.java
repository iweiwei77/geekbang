package org.geektimes.projects.user.web.controller;


import org.geektimes.web.mvc.controller.PageController;
import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/register")
public class RegisterController implements PageController {

    @GET
    @POST
    @Path("/login-form")
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "login-form.jsp";
    }

    @POST
    @Path("/doSignUp")
    public String doSingUp(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String path=request.getContextPath();
		String basePath=request.getScheme()+"://"+request.getServerName() +":"+request.getServerPort()+path+"/";
    	String useremail = request.getParameter("email");
        String password = request.getParameter("pwd");
        User user = new User();
        user.setEmail(useremail);
        user.setPassword(password);
        
        /*	 
        UserService userService = new UserService();
        userService.register(user);
        */
        return "loginOK.jsp";
    }
    
    
    @POST
    @Path("/login")
    public String doLogin(HttpServletRequest request, HttpServletResponse response) throws Throwable {
    	execute(request, response);
        String userEmail=request.getParameter("inputEmail");
        String userPassword=request.getParameter("inputPassword");
        
        if(userEmail.equals("admin@domain.com")&&userPassword.equals("admin123")) {
    		response.sendRedirect(request.getContextPath()+"loginOK.jsp");
    		return "loginOK.jsp";
    		
    	}else {
    		request.setAttribute("message", "Wrong email or password, please login again! <br>");
    		request.getRequestDispatcher("loginFail.jsp").forward(request, response);
    		return "loginFail.jsp";
    	}
        
    }    

       
}