package com.backend.rootly.utility;

// This utility intentionally exposes only shared endpoint constants.
@SuppressWarnings("PMD.DataClass")
public final class EndPoint {

    public static final String API = "/api";
    public static final String EXPLORE_PLACES = "/v1/explore/places";
    public static final String EXPLORE_CATEGORIES = "/v1/explore/categories";
    public static final String EXPLORE_PATH_PATTERN = "/v1/explore/**";

    private EndPoint() {
    }
}
