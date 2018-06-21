package com.nk.retrofitdemo;

public class Event {

    private String eventId;
    private String eventShortName;
    private String createdBy;
    private String eventName;
    private String image;
    private String hostedBy;
    private String location;
    private String description;
    private String eventType;
    private String BookingUrl;
    private String city;
    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private int register_user;
    private int like_user;
    private int is_user_register;
    private int is_user_like;

    public Event(String eventId, String eventShortName, String createdBy, String eventName, String image, String hostedBy, String location, String description, String eventType, String bookingUrl, String city, String startDate, String startTime, String endDate, String endTime, int register_user, int like_user, int is_user_register, int is_user_like) {
        this.eventId = eventId;
        this.eventShortName = eventShortName;
        this.createdBy = createdBy;
        this.eventName = eventName;
        this.image = image;
        this.hostedBy = hostedBy;
        this.location = location;
        this.description = description;
        this.eventType = eventType;
        BookingUrl = bookingUrl;
        this.city = city;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.register_user = register_user;
        this.like_user = like_user;
        this.is_user_register = is_user_register;
        this.is_user_like = is_user_like;
    }


    public String getEventId() {
        return eventId;
    }

    public String getEventShortName() {
        return eventShortName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getEventName() {
        return eventName;
    }

    public String getImage() {
        return image;
    }

    public String getHostedBy() {
        return hostedBy;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getEventType() {
        return eventType;
    }

    public String getBookingUrl() {
        return BookingUrl;
    }

    public String getCity() {
        return city;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public int getRegister_user() {
        return register_user;
    }

    public int getLike_user() {
        return like_user;
    }

    public int getIs_user_register() {
        return is_user_register;
    }

    public int getIs_user_like() {
        return is_user_like;
    }
}
