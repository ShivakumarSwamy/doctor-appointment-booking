package com.example.doctorappointmentbooking.service;

import com.example.doctorappointmentbooking.domain.Appointment;
import com.example.doctorappointmentbooking.dto.AppointmentBookingRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AppointmentBookingServiceImpl implements AppointmentBookingService {

    @Override
    public Appointment createAppointment(AppointmentBookingRequest appointmentBookingRequest) {
        return null;
    }

    @Override
    public Collection<Appointment> getAllAppointments() {
        return null;
    }
}
