package com.api.BarberAppointments.infra.security.config;

import com.api.BarberAppointments.repository.UserRepository;
import com.api.BarberAppointments.service.InitializerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@DependsOn("adminInitializer")
public class BarberInitializer {
    private final InitializerService initializerService; // Novo campo

    // Construtor que injeta o serviço
    public BarberInitializer(InitializerService initializerService) {
        this.initializerService = initializerService;
    }

    @Bean
    CommandLineRunner initBarber(UserRepository userRepository) {
        return  args -> {
            String barberEmail = "barber@beardsoft.com";
            if (userRepository.findByEmail(barberEmail).isEmpty()) {

                try {
                    initializerService.createBarberUser(
                            barberEmail,
                            "Barbeiro Teste",
                            "barber123"
                    );
                    System.out.println("✅ Usuário Barbeiro de Teste criado com sucesso!");
                } catch (Exception e) {
                    System.err.println("❌ Erro fatal ao criar Barbeiro de Teste: " + e.getMessage());
                }
            } else {
                System.out.println("ℹ️ Usuário Barbeiro de Teste já existe, nenhum novo foi criado.");
            }
        };
    }
}
