package heatwaves.backend.controllers;

import heatwaves.backend.models.Booking;
import heatwaves.backend.models.User;
import heatwaves.backend.repositories.BookingJpaRepository;
import heatwaves.backend.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {
    private BookingService bookingService;

    @Autowired
    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Autowired
    private BookingJpaRepository bookingJpaRepository;

    @GetMapping
    public List<Booking> list() {
        return bookingJpaRepository.findAll();
    }

    @GetMapping("/create")
    public Booking create() {
        Booking b = new Booking();
        b.setStatus("BOOKED");
        bookingJpaRepository.saveAndFlush(b);
        return b;
    }

    @GetMapping("/createservice")
    public User createservice() {
        Booking b = new Booking();
        b.setStatus("PAID");
        return bookingService.booking(b);
    }
}
