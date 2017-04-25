package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import edu.matc.entity.User;
import edu.matc.interceptors.UserAware;
import org.apache.log4j.Logger;

/**
 * Created by Punitha Anandan on 3/6/2017.
 */
public class CompareExpensesAction extends ActionSupport implements UserAware, ModelDriven<User> {
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private User user;

    /** Execute method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        log.info("CompareExpensesAction.execute method starts");
        return SUCCESS;
    }

    /** Set User
     *
     * @param user
     */
    @Override
    public void setUser(User user) {
        this.user=user;
    }

    /** Get User
     *
     * @param user
     * @return user
     */
    public User getUser(User user){
        return this.user;
    }

    /**get Model
     *
     * @return user
     */
    @Override
    public User getModel() {
        return this.user;
    }
}