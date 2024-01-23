package com.example.demo2.entity;

import java.util.List;

public class Commit {

    private Author author;
    private String message;
    private List<String> added;
    private List<String> modified;
    private List<String> removed;

    // Getters and setters

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getAdded() {
        return added;
    }

    public void setAdded(List<String> added) {
        this.added = added;
    }

    public List<String> getModified() {
        return modified;
    }

    public void setModified(List<String> modified) {
        this.modified = modified;
    }

    public List<String> getRemoved() {
        return removed;
    }

    public void setRemoved(List<String> removed) {
        this.removed = removed;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "author=" + author +
                ", message='" + message + '\'' +
                ", added=" + added +
                ", modified=" + modified +
                ", removed=" + removed +
                '}';
    }
}

