package com.sahikadam.razorpay.payment.config;

import com.sahikadam.razorpay.common.enums.PaymentMethod;
import com.sahikadam.razorpay.payment.processor.PaymentProcessor;
import com.sahikadam.razorpay.payment.processor.strategy.UpiPaymentProcessor;
import com.sahikadam.razorpay.payment.processor.strategy.NetBankingPaymentProcessor;
import com.sahikadam.razorpay.payment.processor.strategy.CardPaymentProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class PaymentProcessorConfig {

    private final CardPaymentProcessor cardPaymentProcessor;
    private final NetBankingPaymentProcessor netBankingPaymentProcessor;
    private final UpiPaymentProcessor upiPaymentProcessor;

    @Bean
    public Map<PaymentMethod, PaymentProcessor> paymentProcessorMap() {
        return Map.of(
                PaymentMethod.CARD, cardPaymentProcessor,
                PaymentMethod.NETBANKING, netBankingPaymentProcessor,
                PaymentMethod.UPI, upiPaymentProcessor
        );
    }
}
