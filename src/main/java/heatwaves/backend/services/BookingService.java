package heatwaves.backend.services;

import heatwaves.backend.models.Booking;
import heatwaves.backend.models.User;
import heatwaves.backend.repositories.BookingJpaRepository;
import heatwaves.backend.repositories.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class BookingService {
    @Autowired
    private BookingJpaRepository bookingRepo;

    @Autowired
    private UserJpaRepository UserRepo;

    @PersistenceContext
    private EntityManager entityManager;

    public void book(Booking booking) {
        Booking b = new Booking();
        b.setStatus(booking.getStatus());
        bookingRepo.saveAndFlush(b);
    }

    public User booking(Booking book) {
        Booking b = new Booking();
        User g = new User();

        g.setFirst_name("Juan");
        b.setStatus(book.getStatus());

        b.setUser(g);

        UserRepo.saveAndFlush(g);
        bookingRepo.saveAndFlush(b);

        return g;
    }
}
