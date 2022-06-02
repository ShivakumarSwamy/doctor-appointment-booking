package com.example.doctorappointmentbooking.service;

import com.example.doctorappointmentbooking.domain.Appointment;
import com.example.doctorappointmentbooking.dto.AppointmentBookingRequest;

public interface AppointmentBookingService {

    Appointment createAppointment(AppointmentBookingRequest appointmentBookingRequest);

}
