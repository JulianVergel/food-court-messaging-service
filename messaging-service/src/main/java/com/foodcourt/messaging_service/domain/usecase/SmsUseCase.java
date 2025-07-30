package com.foodcourt.messaging_service.domain.usecase;

import com.foodcourt.messaging_service.domain.api.ISmsServicePort;
import com.foodcourt.messaging_service.domain.model.SmsMessage;
import com.foodcourt.messaging_service.domain.spi.ISmsClientPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SmsUseCase implements ISmsServicePort {
    private final ISmsClientPort smsClientPort;

    @Override
    public void sendSms(SmsMessage smsMessage) {
        smsClientPort.sendSms(smsMessage.getPhone(), smsMessage.getMessage());
    }
}
