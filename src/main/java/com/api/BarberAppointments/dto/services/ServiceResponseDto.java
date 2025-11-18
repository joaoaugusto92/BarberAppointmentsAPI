package com.api.BarberAppointments.dto.services;

import java.math.BigDecimal;

public record ServiceResponseDto(
        Long id,
        String name,
        BigDecimal value,
        String displayValue, // Mostra o valor já formatado (Ex "R$30,00" )
        String description,
        Integer durationInMinutes,
        String displayDuration, //mostra a duração já formatada (1h 15m)
        String imageUrl,
        String category,
        Boolean isActive
) {}
