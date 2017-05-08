package edu.matc.interceptors;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import edu.matc.entity.User;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created by Punitha Anandan on 3/19/2017.
 */
public class AuthenticationInterceptor implements Interceptor {
    private static final long serialVersionUID = -5011962009065225959L;
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * destroy Method
     */
    @Override
    public void destroy() {
    }

    /**
     * init Method
     */
    @Override
    public void init() {
    }

    /**intercept Method
     *
     * @param actionInvocation
     * @return String
     * @throws Exception
     */
    @Override
    public String intercept(ActionInvocation actionInvocation)
               throws Exception {
        log.info("inside auth interceptor");
        Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
        User user = (User) sessionAttributes.get("USER");
        Action action = (Action) actionInvocation.getAction();
        log.info("action.getClass().getName():"+action.getClass().getName());
        if(user == null){
        log.info("user == null");
            if(action.getClass().getName().equals("edu.matc.action.ShowSignUpAction")
                                || action.getClass().getName().equals("edu.matc.action.SignUpAction")
                                ) {
                return actionInvocation.invoke();
            }
            return Action.LOGIN;
            } else {
                log.info("user != null");
                log.info("action.getClass().getName():"+action.getClass().getName());
            if(action instanceof UserAware){
                     ((UserAware) action).setUser(user);
            }
                return actionInvocation.invoke();
            }
    }
}
