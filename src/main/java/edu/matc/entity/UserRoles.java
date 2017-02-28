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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserRoles{" +
                "roleName='" + roleName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
