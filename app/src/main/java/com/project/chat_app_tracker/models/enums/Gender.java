package com.project.chat_app_tracker.models.enums;

public enum Gender {
    FEMALE("female"),
    MALE("male"),
    OTHER("other");

    private String value;

    private Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
