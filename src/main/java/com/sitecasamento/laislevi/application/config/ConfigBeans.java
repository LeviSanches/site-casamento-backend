package com.sitecasamento.laislevi.application.config;

import com.sitecasamento.laislevi.application.core.usecase.InsertAcompanhanteUseCase;
import com.sitecasamento.laislevi.application.core.usecase.InsertConvidadoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

    @Bean
    public InsertConvidadoUseCase insertConvidadoUseCase() {
        return new InsertConvidadoUseCase();
    }

    @Bean
    public InsertAcompanhanteUseCase insertAcompanhanteUseCase() {
        return new InsertAcompanhanteUseCase();
    }
}
