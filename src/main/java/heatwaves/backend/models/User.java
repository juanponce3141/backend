package heatwaves.backend.models;


import javax.persistence.*;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @OneToOne
    private Booking booking;

    private String first_name;
    private String last_name;
    private String ig_name;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long guest_id) {
        this.user_id = guest_id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getIg_name() {
        return ig_name;
    }

    public void setIg_name(String ig_name) {
        this.ig_name = ig_name;
    }
}
