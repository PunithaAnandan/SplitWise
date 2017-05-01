package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.matc.entity.User;
import edu.matc.entity.UserRoles;
import edu.matc.persistence.UserDao;
import edu.matc.persistence.UserRolesDao;
import org.apache.log4j.Logger;

/**
 * Created by Punitha Anandan on 4/18/2017.
 */
public class SignUpAction extends ActionSupport {
    private final Logger log = Logger.getLogger(this.getClass());

    private String firstName;
    private String lastName;
    private String emailId;
    private String password;


    /** Execute Method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public String execute() {
        User user = new User();
        UserRoles userRoles = new UserRoles();
        UserDao userDao = new UserDao();
        UserRolesDao userRolesDao = new UserRolesDao();
        log.info("SignUpAction.execute");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmailId(emailId);
        user.setPassword(password);
        userDao.addUser(user);
        userRoles.setRoleName("registered-user");
        userRoles.setEmailId(emailId);
        userRolesDao.addUserRole(userRoles);
        return SUCCESS;
    }

    /**Get FirstName
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**set FirstName
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**Get LastName
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**set LastName
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**Get emailId
     *
     * @return emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**set EmailId
     *
     * @param emailId
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**Get Password
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**set Password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** Execute Method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public void validate()
    {
        log.info("SignUpAction.validate");
        if (firstName == null || firstName.trim().equals(""))
        {
            addFieldError("firstName","The First Name is required");
        }
        if (lastName == null || lastName.trim().equals(""))
        {
            addFieldError("lastName","The Last Name is required");
        }
        if (emailId == null || emailId.trim().equals(""))
        {
            addFieldError("emailId","The Email Id is required");
        }

        if (password == null || password.trim().equals(""))
        {
            addFieldError("password","The Password Id is required");
        }

    }

}
