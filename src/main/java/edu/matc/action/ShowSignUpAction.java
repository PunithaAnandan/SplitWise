package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by Punitha Anandan on 3/21/2017.
 */
public class ShowSignUpAction extends ActionSupport implements SessionAware, ModelDriven<User> {
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private User user = new User();
    private Map<String, Object> sessionAttributes = null;

    /** Execute Method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        log.debug("ShowSignUpAction.execute method");
        log.info("ShowSignUpAction.execute method");
        return SUCCESS;
    }

    /**set Session
     *
     * @param sessionAttributes
     */
    @Override
    public void setSession(Map<String, Object> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**get Model
     *
     * @return User
     */
    @Override
    public User getModel() {
        return user;
    }

}