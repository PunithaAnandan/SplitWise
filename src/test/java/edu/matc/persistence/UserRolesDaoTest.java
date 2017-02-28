package edu.matc.persistence;

import edu.matc.entity.UserRoles;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created on 9/13/16.
 *
 * @author pwaite
 */
public class UserRolesDaoTest {

    UserRolesDao userRolesDao;

    @Before
    public void setup() {
        userRolesDao = new UserRolesDao();
    }

    @Test
    public void getUserRoles() throws Exception {
        UserRoles userRoles = userRolesDao.getUserRoles("jagan@gmail.com");
        assertTrue(userRoles.getRoleName().equals("registered-user"));
    }
}
