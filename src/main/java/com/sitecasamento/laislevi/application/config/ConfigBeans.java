package com.sitecasamento.laislevi.application.config;

import com.sitecasamento.laislevi.adapters.output.ConvidadoRepositoryAdapter;
import com.sitecasamento.laislevi.adapters.output.PaymentRepositoryAdapter;
import com.sitecasamento.laislevi.adapters.output.ProdutoRepositoryAdapter;
import com.sitecasamento.laislevi.application.core.services.MercadoPagoService;
import com.sitecasamento.laislevi.application.core.usecase.*;
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
    public InsertProdutoUseCase insertProdutoUseCase() {
        return new InsertProdutoUseCase();
    }

    @Bean
    public SearchProdutoUseCase searchProdutoUseCase() {
        return new SearchProdutoUseCase();
    }

    @Bean
    public PaymentUseCase insertPaymentUseCase() {
        return new PaymentUseCase();
    }

    @Bean
    public ConvidadoRepositoryAdapter convidadoRepositoryAdapter() {
        return new ConvidadoRepositoryAdapter();
    }

    @Bean
    public ProdutoRepositoryAdapter produtoRepositoryAdapter() {
        return new ProdutoRepositoryAdapter();
    }

    @Bean
    public PaymentRepositoryAdapter paymentRepositoryAdapter() {
        return new PaymentRepositoryAdapter();
    }

}
