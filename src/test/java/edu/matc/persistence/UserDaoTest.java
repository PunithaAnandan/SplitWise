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

    /**
     * setup Method
     */
    @Before
    public void setup() {
        userDao = new UserDao();
        user = new User();
    }

    /**add UserTest
     *
     * @throws Exception
     */
    @Test
    public void addUserTest() throws Exception {
        user.setFirstName("Raj");
        user.setLastName("Ram");
        user.setEmailId("ram@gmail.com");
        user.setPassword("ram");
        assertTrue(userDao.addUser(user)>0);
    }

    /**get UserTest
     *
     * @throws Exception
     */
    @Test
    public void getUserTest() throws Exception {
        User user = userDao.getUser(7);
        assertTrue(user.getLastName().equalsIgnoreCase("Ram"));
    }


    /**getUserByEmailIdTest
     *
     * @throws Exception
     */
    @Test
    public void getUserByEmailIdTest() throws Exception {
        User user = userDao.getUserByEmailId("ram@gmail.com");
        assertTrue(user.getLastName().equalsIgnoreCase("Ram"));

    }

    /**deleteUserTest
     *
     * @throws Exception
     */
    @Test
    public void deleteUserTest() throws Exception {
        user.setUserId(9);
        userDao.deleteUser(user);
        assertTrue("User still in the DB",user.getUserId()==9);
    }


}
