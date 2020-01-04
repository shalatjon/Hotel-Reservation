package com.techpro.api.hotelreservation.controller;

import com.techpro.api.hotelreservation.domain.Reservation;
import com.techpro.api.hotelreservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ReservationController {

    @Autowired //Spring takes Service from context and makes it available in controller class. Spring creates an instance and loads it.
            ReservationService reservationService;
    @PreAuthorize("(#oauth2.hasScope('reservation') and #oauth2.hasScope('write')) or hasRole('ADMIN')")
    @PostMapping("/reservation")
    public Reservation createReservation(@RequestBody Reservation newReservation){
        Reservation r= reservationService.createNewReservation(newReservation);
        return r;
    }
    @GetMapping("/reservation/{id}")
    public Reservation getReservationByID(@PathVariable String id)
    {
        Reservation r = reservationService.getReservationById(id);
        return r;
    }

    @PreAuthorize("(#oauth2.hasScope('reservation') and #oauth2.hasScope('read')) or hasRole('ADMIN')")
    @GetMapping("/reservation")
    public Reservation getReservationByBookingNumber(@RequestParam String bookingNumber)
    {
        Reservation r = reservationService.getReservationByBookingNumber(bookingNumber);
        System.out.println(r);
        return r;
    }
    @PutMapping("/reservation/{bookingNumber}")
    public Reservation updateReservationByBookingNumber(@PathVariable String bookingNumber,@RequestBody Reservation newReservation){
        Reservation r = reservationService.updateReservationByBookingNumber(bookingNumber,newReservation);
        return r;
    }
    @DeleteMapping("/reservation/{bookingNumber}")
    public void deleteReservationByBookingNumber(@PathVariable String bookingNumber){
        reservationService.deleteReservationByBookingNumber(bookingNumber);
    }
    @GetMapping("/reservation/email")
    public List<Reservation> getReservationByEmailID(@RequestParam String emailID)
    {
        List<Reservation> r = reservationService.getReservationByEmailID(emailID);
        System.out.println(r);
        return r;
    }
}
