package com.project.chat_app_tracker.models.enums;

public enum Situation {
    WARNING("warning"),
    DANGER("danger");

    private String value;

    private Situation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
