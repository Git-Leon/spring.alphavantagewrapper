package com.github.git_leon.utilities;

/**
 * Created by leon on 11/30/17.
 */
public enum APIKey {
    DEMO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
