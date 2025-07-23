package com.foodcourt.messaging_service.application.handler.impl;

import com.foodcourt.messaging_service.application.dto.request.SmsRequestDto;
import com.foodcourt.messaging_service.application.handler.ISmsHandler;
import com.foodcourt.messaging_service.application.mapper.request.ISmsRequestMapper;
import com.foodcourt.messaging_service.domain.api.ISmsServicePort;
import com.foodcourt.messaging_service.domain.model.SmsMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmsHandler implements ISmsHandler {
    private final ISmsServicePort smsServicePort;
    private final ISmsRequestMapper smsRequestMapper;

    @Override
    public void sendSms(SmsRequestDto smsRequestDto) {
        SmsMessage smsMessage = smsRequestMapper.toSmsMessage(smsRequestDto);
        smsServicePort.sendSms(smsMessage);
    }
}
