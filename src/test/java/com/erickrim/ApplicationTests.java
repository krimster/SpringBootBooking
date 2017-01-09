package com.erickrim;

import com.erickrim.entities.Booking;
import com.erickrim.repositories.ReservationRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Application test class
 * Created by krime on 1/8/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    ReservationRepository reservationRepository;

    @Test
    public void contextLoads() {
        Assert.assertNotNull("the repository should not be null",
                this.reservationRepository);
    }

    @Test
    public void testFindByBookingName() {
        Assert.assertTrue("There should be one record with booking name Longs",
                this.reservationRepository.findByBookingName( "Longs").size() == 1);
    }

    @Test
    public void testLoadingResultInDatabase() {

        List<Booking> bookingList =
                this.reservationRepository.findAll();
        Assert.assertNotNull("there must be a response" , bookingList);
        Assert.assertTrue("there should be at least one result", bookingList.size() > 0);
    }

}