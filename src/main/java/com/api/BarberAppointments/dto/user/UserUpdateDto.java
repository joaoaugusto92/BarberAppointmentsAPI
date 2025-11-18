package com.api.BarberAppointments.dto.user;

public record UserUpdateDto(
        String name,
        String phoneNumber,
        String password
) {
}
