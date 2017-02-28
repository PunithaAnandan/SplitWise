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

    UserDao dao;

    @Before
    public void setup() {
        dao = new UserDao();
    }

    @Test
    public void getUser() throws Exception {
        User user = dao.getUser(47);
        assertTrue(user.getLastName().equalsIgnoreCase("ram"));
    }
}
