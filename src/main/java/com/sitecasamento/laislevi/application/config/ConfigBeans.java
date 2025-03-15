package com.sitecasamento.laislevi.application.config;

import com.sitecasamento.laislevi.adapters.output.ConvidadoRepositoryAdapter;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.core.usecase.DeleteConvidadoUseCase;
import com.sitecasamento.laislevi.application.core.usecase.InsertConvidadoUseCase;
import com.sitecasamento.laislevi.application.core.usecase.SearchConvidadoUseCase;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoryOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

    @Bean
    public InsertConvidadoUseCase insertConvidadoUseCase() {
        return new InsertConvidadoUseCase();
    }

    @Bean
    public DeleteConvidadoUseCase deleteConvidadoUseCase() {
        return new DeleteConvidadoUseCase();
    }

    @Bean
    public SearchConvidadoUseCase searchConvidadoUseCase() {
        return new SearchConvidadoUseCase();
    }

    @Bean
    public ConvidadoRepositoryAdapter convidadoRepositoryAdapter() {
        return new ConvidadoRepositoryAdapter();
    }

}
