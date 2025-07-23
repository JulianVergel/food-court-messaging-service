package com.foodcourt.messaging_service.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmsRequestDto {
    private String phone;
    private String message;
}
