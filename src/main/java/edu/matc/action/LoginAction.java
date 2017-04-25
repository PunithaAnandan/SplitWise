package edu.matc.action;

/**
 * Created by Punitha Anandan on 3/19/2017.
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<User>{
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = -3369875299120377549L;
    private User user = new User();
    private Map<String, Object> sessionAttributes = null;

    /** Execute Method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public String execute(){
        log.info("LoginAction.execute");
        log.info("user.getEmailId():"+user.getEmailId());
        log.info("user.getPassword():"+user.getPassword());
        UserDao userDao = new UserDao();
        User dbUser = null;
        dbUser = userDao.getUserByEmailId(user.getEmailId());

        if(dbUser!=null && dbUser.getPassword().equals(user.getPassword())){
            user.setFirstName(dbUser.getFirstName());
            user.setEmailId(dbUser.getEmailId());
            sessionAttributes.put("USER", user);
            return SUCCESS;
        }
        return INPUT;
    }


    /**setSession Method
     *
     * @param sessionAttributes
     */
    @Override
    public void setSession(Map<String, Object> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**Get Model
     *
     * @return user
     */
    @Override
    public User getModel() {
        return user;
    }

}
