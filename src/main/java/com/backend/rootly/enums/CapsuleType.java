package com.backend.rootly.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CapsuleType {
    PERSONAL("personal"),
    FAMILY("family"),
    COMMUNITY("community");

    private final String value;

    CapsuleType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
