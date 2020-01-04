package com.techpro.api.hotelreservation.db;

import com.techpro.api.hotelreservation.domain.GuestDetails;
import com.techpro.api.hotelreservation.domain.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository extends MongoRepository<Reservation,String>{
   // public Reservation createNewReservation(Reservation newReservation);
    public Optional <Reservation>findByBookingNumber(String bookingNumber);
    @Query("{'guestDetails.email': ?0}")
    public List<Reservation> findByEmailID(String emailID);
}
