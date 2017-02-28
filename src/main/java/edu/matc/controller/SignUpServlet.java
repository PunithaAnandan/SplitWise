package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.UserRoles;
import edu.matc.persistence.UserDao;
import edu.matc.persistence.UserRolesDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by Punitha Anandan on 2/6/2017.
 */
@WebServlet(
        name = "signUpServlet",
        urlPatterns = { "/signUpServlet" }
)

public class SignUpServlet extends javax.servlet.http.HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        log.info("SignUp Servlet doGet method start");
        ServletContext servletContext = getServletContext();
        User user = new User();
        UserRoles userRoles = new UserRoles();
        UserDao userDao = new UserDao();
        UserRolesDao userRolesDao = new UserRolesDao();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String password = request.getParameter("password");
        String emailId = request.getParameter("emailId");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmailId(emailId);
        user.setPassword(password);
        userDao.addUser(user);
        userRoles.setRoleName("registered-user");
        userRoles.setEmailId(emailId);
        userRolesDao.addUserRole(userRoles);
        request.setAttribute("User",user);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
