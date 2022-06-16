package com.example.doctorappointmentbooking.jpa;

import com.example.doctorappointmentbooking.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentBookingRepository extends JpaRepository<Appointment, String> {

}
