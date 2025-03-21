package com.sitecasamento.laislevi.application.ports.output;

import com.sitecasamento.laislevi.application.core.domain.entities.PaymentEntity;

public interface PaymentRepositoryOutputPort {

    void save(PaymentEntity paymentEntity);
}
