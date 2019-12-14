package com.techpro.api.hotelreservation.controller;

import com.techpro.api.hotelreservation.domain.Reservation;
import com.techpro.api.hotelreservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ReservationController {

    @Autowired //Spring takes Service from context and makes it available in controller class. Spring creates an instance and loads it.
    ReservationService reservationService;

    @PostMapping("/reservation")
    public Reservation createReservation(@RequestBody Reservation newReservation){
      Reservation r= reservationService.createNewReservation(newReservation);
      return r;
    }

}
