package com.fullstack_app_with_react_ts.fullstacknoteapp.dto;

public class Notesdto {
    private Long id;
    private String content;

    public Notesdto() {
    }

    public Notesdto(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
