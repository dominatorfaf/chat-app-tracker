package com.project.chat_app_tracker.models;

import com.project.chat_app_tracker.models.enums.Gender;
import com.project.chat_app_tracker.models.enums.Situation;

import java.util.ArrayList;
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
    private ArrayList<String> familyId;
    private ArrayList<String> contactsId;

    private ArrayList<Float> sentiments;
    private ArrayList<Situation> situation;

    public UserModel(String id, String username, String firstName, String lastName, String email,
                     String imageProfileURL, String password, Date dateBirth, Date timeCreated,
                     Date lastUpdated, boolean isActive, boolean isParent, Gender gender,
                     ArrayList<String> familyId, ArrayList<String> contactsId,
                     ArrayList<Float> sentiments, ArrayList<Situation> situation) {
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
        this.contactsId = contactsId;
        this.sentiments = sentiments;
        this.situation = situation;
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

    public void setIsParent(boolean parent) {
        isParent = parent;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ArrayList<String> getFamilyId() {
        return familyId;
    }

    public void setFamilyId(ArrayList<String> familyId) {
        this.familyId = familyId;
    }

    public ArrayList<String> getContactsId() {
        return contactsId;
    }

    public void setContactsId(ArrayList<String> contactsId) {
        this.contactsId = contactsId;
    }

    public ArrayList<Float> getSentiments() {
        return sentiments;
    }

    public void setSentiments(ArrayList<Float> sentiments) {
        this.sentiments = sentiments;
    }

    public ArrayList<Situation> getSituation() {
        return situation;
    }

    public void setSituation(ArrayList<Situation> situation) {
        this.situation = situation;
    }
}
