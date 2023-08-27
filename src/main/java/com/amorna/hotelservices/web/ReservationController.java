package com.amorna.hotelservices.web;

import com.amorna.hotelservices.entities.Reservation;
import com.amorna.hotelservices.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository reservationRepository;

    @GetMapping("/reservations")
    public List<Reservation> reservationList() {

        return reservationRepository.findAll();
    }

    @GetMapping("/reservations/{id}")
    public Reservation getReservation(@PathVariable Long id) {
        return reservationRepository.findById(id).get();

    }

    @PostMapping("/reservations")
    public Reservation save(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @DeleteMapping("/reservations/{id}")
    public void delete(@PathVariable Long id) {
        reservationRepository.deleteById(id);
    }

    @PutMapping("/reservations/{id}")
    public Reservation update(@PathVariable Long id, @RequestBody Reservation reservation) {
        reservation.setId(id);
        return reservationRepository.save(reservation);
    }
}
