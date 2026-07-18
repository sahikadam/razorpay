package com.sahikadam.razorpay.payment.mapper;

import com.sahikadam.razorpay.payment.dto.response.OrderResponse;
import com.sahikadam.razorpay.payment.entity.OrderRecord;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {

    OrderResponse toResponse(OrderRecord orderRecord);
}
