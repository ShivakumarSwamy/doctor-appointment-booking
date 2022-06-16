package com.example.doctorappointmentbooking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class Appointment {

    @Id
    private String id;

    private Date fromDate;
    private Date toDate;

}
