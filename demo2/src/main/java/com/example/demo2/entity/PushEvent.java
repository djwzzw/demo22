package com.example.demo2.entity;

import java.util.List;

public class PushEvent {

    private List<Commit> commits;

    // Getters and setters

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    @Override
    public String toString() {
        return "PushEvent{" +
                "commits=" + commits +
                '}';
    }
}

