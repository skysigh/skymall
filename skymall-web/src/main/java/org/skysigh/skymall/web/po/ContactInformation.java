package org.skysigh.skymall.web.po;

import org.skysigh.skymall.web.enums.ContactType;

import java.io.Serializable;

public class ContactInformation implements Serializable {
    private static final long serialVersionUID = -8008822797745707201L;

    private Long id;
    private Long userId;
    private ContactType contactType;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
