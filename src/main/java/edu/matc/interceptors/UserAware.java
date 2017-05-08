package edu.matc.interceptors;

import edu.matc.entity.User;

/**
 * Created by Punitha Anandan on 3/19/2017.
 */
public interface UserAware {

    /**set User
     *
     * @param user
     */
    public void setUser(User user);
}
