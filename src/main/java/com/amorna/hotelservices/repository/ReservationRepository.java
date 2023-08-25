package com.amorna.hotelservices.repository;
import com.amorna.hotelservices.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
