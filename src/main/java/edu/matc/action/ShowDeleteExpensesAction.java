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

    //private MessageStore messageStore;
    @Override
    public String execute() throws Exception {

        //messageStore = new MessageStore() ;
        //log.debug("ShowViewExpensesAction.execute method");
        System.out.println("ShowDeleteExpensesAction.execute method");
        //System.out.println("ShowViewExpensesAction.user.getEmailId:"+user.getEmailId());
        return SUCCESS;
    }


    @Override
    public void setUser(User user) {
        this.user=user;
    }

    public User getUser(User user){
        return this.user;
    }

    @Override
    public User getModel() {
        return this.user;
    }
}
