package com.api.BarberAppointments.repository;

import com.api.BarberAppointments.domain.Baber.BarberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepository extends JpaRepository<BarberEntity, Long> {
}
