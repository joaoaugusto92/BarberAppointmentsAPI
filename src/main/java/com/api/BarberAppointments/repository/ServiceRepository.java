package com.api.BarberAppointments.repository;

import com.api.BarberAppointments.domain.service.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
    Optional<ServiceEntity> findByNameAndIdNot(String name, Long id);
}
