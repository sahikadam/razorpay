package com.sahikadam.razorpay.merchant.service;

import com.sahikadam.razorpay.merchant.dto.request.LoginRequest;
import com.sahikadam.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.sahikadam.razorpay.merchant.dto.response.LoginResponse;
import com.sahikadam.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup(MerchantSignupRequest request);

    LoginResponse login(LoginRequest request);
}
