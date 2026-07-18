package com.sahikadam.razorpay.merchant.dto.request;

import com.sahikadam.razorpay.common.enums.Environment;

public record CreateApiKeyRequest(
        Environment environment
) {
}
