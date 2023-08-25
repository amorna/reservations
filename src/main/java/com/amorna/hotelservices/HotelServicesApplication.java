package com.amorna.hotelservices;

import com.amorna.hotelservices.entities.Reservation;
import com.amorna.hotelservices.entities.ReservationStatus;
import com.amorna.hotelservices.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotelServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelServicesApplication.class, args);
    }
   // @Bean
   /* CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
        return args -> {
            reservationRepository.save(Reservation.builder().title("RES1").price(450).status(ReservationStatus.CREATED).build());
            reservationRepository.save(Reservation.builder().title("RES2").price(257).status(ReservationStatus.PENDING).build());
            reservationRepository.save(Reservation.builder().title("RES3").price(120).status(ReservationStatus.CREATED).build());
        };
    }
*/
}
