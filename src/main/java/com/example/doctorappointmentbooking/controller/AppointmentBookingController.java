package com.example.doctorappointmentbooking.controller;

import com.example.doctorappointmentbooking.domain.Appointment;
import com.example.doctorappointmentbooking.dto.AppointmentBookingRequest;
import com.example.doctorappointmentbooking.service.AppointmentBookingService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentBookingController {

    private final AppointmentBookingService appointmentBookingService;

    public AppointmentBookingController(AppointmentBookingService appointmentBookingService) {
        this.appointmentBookingService = appointmentBookingService;
    }

    public Appointment createAppointment(@RequestBody AppointmentBookingRequest appointmentBookingRequest) {
        return appointmentBookingService.createAppointment(appointmentBookingRequest);
    }
}
