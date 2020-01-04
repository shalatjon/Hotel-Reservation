package com.techpro.api.hotelreservation.domain;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Reservation {
    @Id
    private String id;
    private String bookingNumber;
    private String check_in_date;
    private String check_out_date;
    private int num_of_guest;
    private int num_of_rooms;
    private String reservation_currency;
    private float reservation_total_price;
    private float reservation_tax;
    private String payment_method;
    private HotelDetails hotelDetails;
    private GuestDetails guestDetails;
   public GuestDetails getGuestDetails() {
        return guestDetails;
    }

    public void setGuestDetails(GuestDetails guestDetails) {
        this.guestDetails = guestDetails;
    }

    public RoomDetails getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(RoomDetails roomDetails) {
        this.roomDetails = roomDetails;
    }

    private PaymentDetails paymentDetails;
    private RoomDetails roomDetails;

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }


    public HotelDetails getHotelDetails() {
        return hotelDetails;
    }

    public void setHotelDetails(HotelDetails hotelDetails) {
        this.hotelDetails = hotelDetails;
    }



//right click and generate -get and set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(String check_in_date) {
        this.check_in_date = check_in_date;
    }

    public String getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(String check_out_date) {
        this.check_out_date = check_out_date;
    }

    public int getNum_of_guest() {
        return num_of_guest;
    }

    public void setNum_of_guest(int num_of_guest) {
        this.num_of_guest = num_of_guest;
    }

    public int getNum_of_rooms() {
        return num_of_rooms;
    }

    public void setNum_of_rooms(int num_of_rooms) {
        this.num_of_rooms = num_of_rooms;
    }

    public String getReservation_currency() {
        return reservation_currency;
    }

    public void setReservation_currency(String reservation_currency) {
        this.reservation_currency = reservation_currency;
    }

    public float getReservation_total_price() {
        return reservation_total_price;
    }

    public void setReservation_total_price(float reservation_total_price) {
        this.reservation_total_price = reservation_total_price;
    }

    public float getReservation_tax() {
        return reservation_tax;
    }

    public void setReservation_tax(float reservation_tax) {
        this.reservation_tax = reservation_tax;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String toString(){
        return String.format(
                "Reservation[id=%s, Number of Rooms='%s', Number of Guests='%s']",
                id, num_of_rooms, num_of_guest);
    }
}
