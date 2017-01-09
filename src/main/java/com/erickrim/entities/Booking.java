package com.erickrim.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Booking class
 * Created by krime on 1/8/17.
 */
// database table will map to class booking
@Entity
public class Booking {

    // column id will be created and value generated automatically
    // plus the @Id annotation specifies it is a primary key
    @Id
    @GeneratedValue
    private Long id;

    // column will be created with name booking_name
    private String bookingName;

    // column will be created with name group_sise
    private int groupSize;

    Booking() {} // required no args default constructor by Jpa

    public Booking(String bookingName, int groupSize) {
        this.bookingName = bookingName;
        this.groupSize = groupSize;
    }

    public Long getId() {
        return id;

    }

    public String getBookingName() {
        return bookingName;
    }

    public int getGroupSize() {
        return groupSize;
    }

}
