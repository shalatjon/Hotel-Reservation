package com.techpro.api.hotelreservation.service;

import com.techpro.api.hotelreservation.db.ReservationRepository;
import com.techpro.api.hotelreservation.domain.HotelDetails;
import com.techpro.api.hotelreservation.domain.Reservation;
//import com.techpro.api.hotelreservation.util.RandomString;
import com.techpro.api.hotelreservation.util.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public Reservation createNewReservation(Reservation newReservation){
        System.out.println(newReservation.toString());
        HotelDetails j= newReservation.getHotelDetails();
        System.out.println(j.toString());
        String bookingNumber = RandomString.getAlphaNumericString(8);//create booking number
        newReservation.setBookingNumber(bookingNumber);
        Reservation s = reservationRepository.save(newReservation);
        return s;
    }
    public Reservation getReservationById(String id){
        Optional<Reservation> t = reservationRepository.findById(id);// this return an optional object thats why wrapper around reservation. To prevent null pointer exception
        return t.get();
    }
    public Reservation getReservationByBookingNumber(String bookingNumber){
        Optional<Reservation> t = reservationRepository.findByBookingNumber(bookingNumber);// this return an optional object thats why wrapper around reservation. To prevent null pointer exception
        return t.get();
    }
    public List<Reservation> getReservationByEmailID(String emailID){
        List<Reservation> t = reservationRepository.findByEmailID(emailID);
        return t;
    }
    public Reservation updateReservationByBookingNumber(String bookingNumber,Reservation newReservation){
        Optional<Reservation> reservation = reservationRepository.findByBookingNumber(bookingNumber);
        if(newReservation.getNum_of_guest() != 0){
            reservation.get().setNum_of_guest(newReservation.getNum_of_guest());
        }// we are doing a get to get actual reservation object which is inside a wrapper
        if(newReservation.getNum_of_rooms() != 0) {
            reservation.get().setNum_of_rooms(newReservation.getNum_of_rooms());
        }
        if(newReservation.getGuestDetails().getFull_name() != null) {
            if(reservation.get().getGuestDetails() != null){
                reservation.get().getGuestDetails().setFull_name(newReservation.getGuestDetails().getFull_name());
            }
        }
        Reservation s = reservationRepository.save(reservation.get());
        return s;

    }
    public void deleteReservationByBookingNumber(String bookingNumber){
        Optional<Reservation> reservation = reservationRepository.findByBookingNumber(bookingNumber);
        reservationRepository.delete(reservation.get());
    }
}
