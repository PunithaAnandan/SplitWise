package edu.matc.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created by Punitha Anandan on 3/21/2017.
 */
public class SignOutAction extends ActionSupport {
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        session.remove("USER");
        return SUCCESS;
    }

}