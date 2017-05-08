package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import edu.matc.entity.User;
import edu.matc.interceptors.UserAware;
import org.apache.log4j.Logger;

/**
 * Created by Punitha Anandan on 4/27/2017.
 */
public class ShowDeleteExpensesAction extends ActionSupport implements UserAware, ModelDriven<User> {
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private User user;

    /**execute Method
     *
     * @return
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        log.info("ShowDeleteExpensesAction.execute method");
        return SUCCESS;
    }


    /**set User
     *
     * @param user
     */
    @Override
    public void setUser(User user) {
        this.user=user;
    }

    /**get User
     *
     * @param user
     * @return User
     */
    public User getUser(User user){
        return this.user;
    }

    /**get Model
     *
     * @return User
     */
    @Override
    public User getModel() {
        return this.user;
    }
}
