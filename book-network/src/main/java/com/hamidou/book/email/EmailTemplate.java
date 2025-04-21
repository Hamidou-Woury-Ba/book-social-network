package com.hamidou.book.email;

import lombok.Getter;

public enum EmailTemplate {

    ACTIVATE_ACCOUNT("activate-account");

    @Getter
    private final String name;

    EmailTemplate(String name) {
        this.name = name;
    }

}
