package com.foodcourt.messaging_service.application.handler;

import com.foodcourt.messaging_service.application.dto.request.SmsRequestDto;

public interface ISmsHandler {
    void sendSms(SmsRequestDto smsRequestDto);
}
