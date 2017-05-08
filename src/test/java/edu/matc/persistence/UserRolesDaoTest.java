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
    UserRoles userRoles;

    /**
     *  setup Method
     */
    @Before
    public void setup() {
        userRolesDao = new UserRolesDao();
        userRoles = new UserRoles();
    }

    /** addUserRoleTest
     *
     * @throws Exception
     */
    @Test
    public void addUserRoleTest() throws Exception {
        userRoles.setEmailId("sam@gmail.com");
        userRoles.setRoleName("registered-user");
        userRolesDao.addUserRole(userRoles);
        assertTrue(userRoles.getRoleName().equals("registered-user"));
    }

    /** getUserRolesTest
     *
     * @throws Exception
     */
    @Test
    public void getUserRolesTest() throws Exception {
        UserRoles userRoles = userRolesDao.getUserRoles("anand@gmail.com");
        assertTrue(userRoles.getRoleName().equals("registered-user"));
    }
}
