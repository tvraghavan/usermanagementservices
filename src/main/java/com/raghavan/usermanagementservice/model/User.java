package com.raghavan.usermanagementservice.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity(name = "user_master")
@Table(name = "user_master")
public class User implements Serializable {

    @Id
    String id;
    String userid;
    String firstname;
    String lastname;
    String status;
    String emailid;
    String mobilenumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", status='" + status + '\'' +
                ", emailid='" + emailid + '\'' +
                ", mobilenumber='" + mobilenumber + '\'' +
                '}';
    }
}
