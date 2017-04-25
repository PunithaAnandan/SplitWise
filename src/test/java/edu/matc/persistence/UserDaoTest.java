package edu.matc.persistence;

import edu.matc.entity.User;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created on 9/13/16.
 *
 * @author pwaite
 */
public class UserDaoTest {

    UserDao userDao;
    User user;

    @Before
    public void setup() {
        userDao = new UserDao();
        user = new User();
    }

    @Test
    public void addUser() throws Exception {
        user.setFirstName("Raj");
        user.setLastName("Ram");
        user.setEmailId("ram@gmail.com");
        user.setPassword("ram");
        assertTrue(userDao.addUser(user)>0);
    }

    @Test
    public void getUser() throws Exception {
        User user = userDao.getUser(7);
        assertTrue(user.getLastName().equalsIgnoreCase("Ram"));
    }


    @Test
    public void getUserByEmailId() throws Exception {

    }


}
