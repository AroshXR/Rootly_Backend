package com.backend.rootly.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CapsulePrivacy {
    PRIVATE("private"),
    SHARED("shared"),
    PUBLIC_AFTER_UNLOCK("public_after_unlock");

    private final String value;

    CapsulePrivacy(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
