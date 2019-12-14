package com.techpro.api.hotelreservation.db;

import com.techpro.api.hotelreservation.domain.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation,String>{
   // public Reservation createNewReservation(Reservation newReservation);
}
