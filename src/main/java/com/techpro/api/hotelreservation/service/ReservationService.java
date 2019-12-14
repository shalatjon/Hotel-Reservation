package com.techpro.api.hotelreservation.service;

import com.techpro.api.hotelreservation.db.ReservationRepository;
import com.techpro.api.hotelreservation.domain.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public Reservation createNewReservation(Reservation newReservation){
        System.out.println(newReservation.toString());

        Reservation s = reservationRepository.save(newReservation);
        return s;
    }

}
