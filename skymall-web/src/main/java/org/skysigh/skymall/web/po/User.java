package org.skysigh.skymall.web.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private static final long serialVersionUID = 4135953639710881151L;

    private Long id;
    private String account;
    private String password;
    private String realName;
    private String nickName;
    //private Date birthDay;

    private List<ContactInformation> contactInformations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

//    public Date getBirthDay() {
//        return birthDay;
//    }
//
//    public void setBirthDay(Date birthDay) {
//        this.birthDay = birthDay;
//    }

    public List<ContactInformation> getContactInformations() {
        return contactInformations;
    }

    public void setContactInformations(List<ContactInformation> contactInformations) {
        this.contactInformations = contactInformations;
    }
}
