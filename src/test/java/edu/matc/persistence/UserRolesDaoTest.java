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
    @Test
    public void addUserRole() throws Exception {

    }

    @Test
    public void getUserRoles1() throws Exception {

    }

    UserRolesDao userRolesDao;

    @Before
    public void setup() {
        userRolesDao = new UserRolesDao();
    }

    @Test
    public void getUserRoles() throws Exception {
        UserRoles userRoles = userRolesDao.getUserRoles("anand@gmail.com");
        assertTrue(userRoles.getRoleName().equals("registered-user"));
    }
}
