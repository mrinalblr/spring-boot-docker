package com.stackfortech.springbootdocker.model;

public class User {

    private String channelName;
    private String topic;
    private String category;

    public User(String channelName, String topic, String category) {
        this.channelName = channelName;
        this.topic = topic;
        this.category = category;
    }

    public User() {
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
