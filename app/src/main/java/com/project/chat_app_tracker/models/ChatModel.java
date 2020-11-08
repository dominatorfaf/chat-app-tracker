package com.project.chat_app_tracker.models;

import java.util.Date;

public class ChatModel {
    private String id;
    private String[] participantsId;
    private String[] chatMessages;
    private Date timeCreated;
    private Float[] sentiment;

    public ChatModel() {}

    public ChatModel(String id, String[] participantsId, String[] chatMessages, Date timeCreated, Float[] sentiment) {
        this.id = id;
        this.participantsId = participantsId;
        this.chatMessages = chatMessages;
        this.timeCreated = timeCreated;
        this.sentiment = sentiment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getParticipantsId() {
        return participantsId;
    }

    public void setParticipantsId(String[] participantsId) {
        this.participantsId = participantsId;
    }

    public String[] getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(String[] chatMessages) {
        this.chatMessages = chatMessages;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Float[] getSentiment() {
        return sentiment;
    }

    public void setSentiment(Float[] sentiment) {
        this.sentiment = sentiment;
    }
}