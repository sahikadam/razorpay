package com.sahikadam.razorpay.payment.processor;

import com.sahikadam.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.sahikadam.razorpay.payment.processor.dto.PaymentProcessorResponse;

public interface PaymentProcessor {

    PaymentProcessorResponse charge(PaymentProcessorRequest request);

}
