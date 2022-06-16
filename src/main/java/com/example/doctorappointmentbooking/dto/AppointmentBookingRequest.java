package com.example.doctorappointmentbooking.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AppointmentBookingRequest {

    private Date fromDate;
    private Date toDate;
}
