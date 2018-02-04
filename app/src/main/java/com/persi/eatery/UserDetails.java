package com.persi.eatery;

/**
 * Created by Persi on 30-01-2018.
 */

public class UserDetails {
    private String name;
    private String email;
    private String hostel;
    private String room;
    private String phone_no;

    public UserDetails(String name, String email, String hostel, String room, String phone_no) {
        this.name = name;
        this.email = email;
        this.hostel = hostel;
        this.room = room;
        this.phone_no = phone_no;
    }

    public UserDetails() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getHostel() {
        return hostel;
    }

    public String getRoom() {
        return room;
    }

    public String getPhone_no() {
        return phone_no;
    }
}
