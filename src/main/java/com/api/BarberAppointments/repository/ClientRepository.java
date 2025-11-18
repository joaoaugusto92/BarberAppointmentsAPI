package com.api.BarberAppointments.repository;

import com.api.BarberAppointments.domain.Client.ClientEntity;
import com.api.BarberAppointments.domain.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository <ClientEntity, Long> {
    Optional<ClientEntity> findByUser(UserEntity user);
}
