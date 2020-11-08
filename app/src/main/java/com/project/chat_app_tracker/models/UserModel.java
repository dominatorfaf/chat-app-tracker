package com.project.chat_app_tracker.models;

import com.project.chat_app_tracker.models.enums.Gender;
import com.project.chat_app_tracker.models.enums.Situation;

import java.util.Date;

public class UserModel {
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String imageProfileURL;
    private String password;
    private Date dateBirth;
    private Date timeCreated;
    private Date lastUpdated;
    private boolean isActive;
    private boolean isParent;
    private Gender gender;
    private String[] familyId;
    private String[] contactsId;

    private Float[] sentiments;
    private Situation[] situation;

    public UserModel(String id, String username, String firstName, String lastName, String email,
                     String imageProfileURL, String password, Date dateBirth, Date timeCreated,
                     Date lastUpdated, boolean isActive, boolean isParent, Gender gender,
                     String[] familyId) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.imageProfileURL = imageProfileURL;
        this.password = password;
        this.dateBirth = dateBirth;
        this.timeCreated = timeCreated;
        this.lastUpdated = lastUpdated;
        this.isActive = isActive;
        this.isParent = isParent;
        this.gender = gender;
        this.familyId = familyId;
    }

    public UserModel() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageProfileURL() {
        return imageProfileURL;
    }

    public void setImageProfileURL(String imageProfileURL) {
        this.imageProfileURL = imageProfileURL;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setParent(boolean parent) {
        isParent = parent;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String[] getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String[] familyId) {
        this.familyId = familyId;
    }

    public Float[] getSentiments() {
        return sentiments;
    }

    public void setSentiments(Float[] sentiments) {
        this.sentiments = sentiments;
    }

    public Situation[] getSituation() {
        return situation;
    }

    public void setSituation(Situation[] situation) {
        this.situation = situation;
    }

    public String[] getContactsId() {
        return contactsId;
    }

    public void setContactsId(String[] contactsId) {
        this.contactsId = contactsId;
    }
}
