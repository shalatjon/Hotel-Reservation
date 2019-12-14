package com.techpro.api.hotelreservation.domain;

import org.springframework.data.annotation.Id;

public class Reservation {
    @Id
    private String id;
    private String bookingNumber;
    private String check_in_date;
    private String check_out_date;
    private int num_of_guest;
    private int num_of_rooms;

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
    public String toString(){
        return String.format(
                "Reservation[id=%s, Number of Rooms='%s', Number of Guests='%s']",
                id, num_of_rooms, num_of_guest);
    }
}
