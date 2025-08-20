package com.foodcourt.messaging_service.domain.api;

import com.foodcourt.messaging_service.domain.model.SmsMessage;

public interface ISmsServicePort {
    void sendSms(SmsMessage smsMessage);
}
