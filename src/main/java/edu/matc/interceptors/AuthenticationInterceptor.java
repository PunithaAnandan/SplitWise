package edu.matc.interceptors;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import edu.matc.entity.User;

import java.util.Map;

/**
 * Created by Punitha Anandan on 3/19/2017.
 */
public class AuthenticationInterceptor implements Interceptor {

        private static final long serialVersionUID = -5011962009065225959L;

        @Override
        public void destroy() {
            //release resources here
        }

        @Override
        public void init() {
            // create resources here
        }

        @Override
        public String intercept(ActionInvocation actionInvocation)
                throws Exception {
            System.out.println("inside auth interceptor");
            Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();

            User user = (User) sessionAttributes.get("USER");
            Action action = (Action) actionInvocation.getAction();
            System.out.println("action.getClass().getName():"+action.getClass().getName());
            // User not logged in
            if(user == null){
                System.out.println("user == null");
                if(action.getClass().getName().equals("edu.matc.action.ShowSignUpAction")
                        || action.getClass().getName().equals("edu.matc.action.SignUpAction")
                        ){
                    return actionInvocation.invoke();
                }
                return Action.LOGIN;
            }else{
                // User logged in
                System.out.println("user != null");
                System.out.println("action.getClass().getName():"+action.getClass().getName());
                if(action instanceof UserAware){
                    ((UserAware) action).setUser(user);
                }
                return actionInvocation.invoke();
            }
        }
}
