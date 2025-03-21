package com.sitecasamento.laislevi.application.ports.input;

import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.sitecasamento.laislevi.application.core.domain.DTOs.PaymentDTO;

import java.lang.reflect.InvocationTargetException;

public interface PaymentInputPort {

    String createPayment(PaymentDTO paymentDTO) throws MPException, MPApiException;

    void insertPayment(PaymentDTO paymentDTO) throws InvocationTargetException, IllegalAccessException;
}
