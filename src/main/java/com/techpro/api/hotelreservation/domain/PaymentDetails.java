package com.techpro.api.hotelreservation.domain;

import java.util.Date;

public class PaymentDetails {
    public long getCredit_card_num() {
        return credit_card_num;
    }

    public void setCredit_card_num(long credit_card_num) {
        this.credit_card_num = credit_card_num;
    }

    public String getCredit_card_type() {
        return credit_card_type;
    }

    public void setCredit_card_type(String credit_card_type) {
        this.credit_card_type = credit_card_type;
    }



    public byte getSec_code() {
        return sec_code;
    }

    public void setSec_code(byte sec_code) {
        this.sec_code = sec_code;
    }

    private long credit_card_num;
    private String credit_card_type;

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    private String expiry_date;
    private byte sec_code;

}
