package com.backend.rootly.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UnlockConditionType {
    DATE("date"),
    LOCATION("location"),
    OCCASION("occasion");

    private final String value;

    UnlockConditionType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
