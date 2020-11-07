package com.project.chat_app_tracker.models;

import com.project.chat_app_tracker.models.enums.Situation;

import java.util.Date;

public class MessageModel {
    private String id;
    private String content;
    private String userId;
    private String chatId;
    private String status;
    private Date timeCreated;
    private Float sentiment;
    private Situation situation;

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    public MessageModel(String id, String content, String userId, String chatId, String status,
                        Date timeCreated, Float sentiment) {
        this.id = id;
        this.content = content;
        this.userId = userId;
        this.chatId = chatId;
        this.status = status;
        this.timeCreated = timeCreated;
        this.sentiment = sentiment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Float getSentiment() {
        return sentiment;
    }

    public void setSentiment(Float sentiment) {
        this.sentiment = sentiment;
    }
}
