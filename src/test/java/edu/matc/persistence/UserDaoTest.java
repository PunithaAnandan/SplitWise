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
    public void addUserTest() throws Exception {
        user.setFirstName("Raj");
        user.setLastName("Ram");
        user.setEmailId("ram@gmail.com");
        user.setPassword("ram");
        assertTrue(userDao.addUser(user)>0);
    }

    @Test
    public void getUserTest() throws Exception {
        User user = userDao.getUser(7);
        assertTrue(user.getLastName().equalsIgnoreCase("Ram"));
    }


    @Test
    public void getUserByEmailIdTest() throws Exception {
        User user = userDao.getUserByEmailId("ram@gmail.com");
        assertTrue(user.getLastName().equalsIgnoreCase("Ram"));

    }

    @Test
    public void deleteUserTest() throws Exception {
        user.setUserId(9);
        userDao.deleteUser(user);
        assertTrue("User still in the DB",user.getUserId()==9);
    }


}
