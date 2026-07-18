package com.sahikadam.razorpay.vault.service;

import com.sahikadam.razorpay.common.entity.Money;
import com.sahikadam.razorpay.payment.processor.dto.PaymentProcessorResponse;
import com.sahikadam.razorpay.vault.dto.request.TokenizeRequest;
import com.sahikadam.razorpay.vault.dto.response.TokenizeResponse;

import java.util.Map;
import java.util.UUID;

public interface VaultService {

    TokenizeResponse tokenize(TokenizeRequest request, UUID merchantId);

    PaymentProcessorResponse charge(UUID paymentId, String token, Money amount, Map<String, Object> methodDetails);
}
