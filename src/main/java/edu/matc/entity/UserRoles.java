package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A class to represent a user role.
 *
 * @author puni
 */
@Entity
@Table (name ="user_roles")
public class UserRoles {

    @Id
    @Column(name = "email_Id")
    private String emailId;

    @Column(name = "role_name")
    private String roleName;

    /**get EmailId
     *
     * @return string
     */
    public String getEmailId() {
        return emailId;
    }

    /**set EmailId
     *
     * @param emailId
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**get RoleName
     *
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**set RoleName
     *
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**Tostring
     *
     * @return String
     */
    @Override
    public String toString() {
        return "UserRoles{" +
                "roleName='" + roleName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
