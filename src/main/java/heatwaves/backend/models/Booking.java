package heatwaves.backend.models;

import javax.persistence.*;

@Entity(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long booking_id;

    private String status; // Enum in the future.

    @OneToOne
    private User user;

    public Long getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Long booking_id) {
        this.booking_id = booking_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getGuest() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
