package heatwaves.backend.repositories;

import heatwaves.backend.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingJpaRepository extends JpaRepository<Booking, Long> {
}
