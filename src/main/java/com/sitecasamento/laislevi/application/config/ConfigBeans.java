package com.sitecasamento.laislevi.application.config;

import com.sitecasamento.laislevi.adapters.output.ConvidadoRepositoryAdapter;
import com.sitecasamento.laislevi.adapters.output.PaymentRepositoryAdapter;
import com.sitecasamento.laislevi.adapters.output.ProdutoRepositoryAdapter;
import com.sitecasamento.laislevi.application.core.services.MercadoPagoService;
import com.sitecasamento.laislevi.application.core.usecase.*;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoryOutputPort;
import com.sitecasamento.laislevi.application.ports.output.PaymentRepositoryOutputPort;
import com.sitecasamento.laislevi.application.ports.output.ProdutoRepositoryOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

    @Bean
    public InsertConvidadoUseCase insertConvidadoUseCase(ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort) {
        return new InsertConvidadoUseCase(convidadoRepositoryOutputPort);
    }

    @Bean
    public DeleteConvidadoUseCase deleteConvidadoUseCase(ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort) {
        return new DeleteConvidadoUseCase(convidadoRepositoryOutputPort);
    }

    @Bean
    public SearchConvidadoUseCase searchConvidadoUseCase(ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort) {
        return new SearchConvidadoUseCase(convidadoRepositoryOutputPort);
    }

    @Bean
    public InsertProdutoUseCase insertProdutoUseCase(ProdutoRepositoryOutputPort produtoRepositoryOutputPort) {
        return new InsertProdutoUseCase(produtoRepositoryOutputPort);
    }

    @Bean
    public SearchProdutoUseCase searchProdutoUseCase(ProdutoRepositoryOutputPort produtoRepositoryOutputPort) {
        return new SearchProdutoUseCase(produtoRepositoryOutputPort);
    }

    @Bean
    public PaymentUseCase insertPaymentUseCase(PaymentRepositoryOutputPort paymentRepositoryOutputPort, InsertProdutoUseCase insertProdutoUseCase) {
        return new PaymentUseCase(paymentRepositoryOutputPort, insertProdutoUseCase);
    }

    @Bean
    public MercadoPagoService mercadoPagoService() {
        return new MercadoPagoService();
    }
}
