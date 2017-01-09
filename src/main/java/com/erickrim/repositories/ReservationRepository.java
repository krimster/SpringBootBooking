package com.erickrim.repositories;

import com.erickrim.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by krime on 1/8/17.
 */
public interface ReservationRepository extends JpaRepository<Booking, Long> {

    // Spring Data will look at the name of the method and infer
    // that you want to do something like
    // select * from booking where booking_name = ?
    List<Booking> findByBookingName( String bookingName);
}
