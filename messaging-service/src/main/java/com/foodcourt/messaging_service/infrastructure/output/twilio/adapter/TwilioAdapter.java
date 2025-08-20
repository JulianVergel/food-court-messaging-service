package com.foodcourt.messaging_service.infrastructure.output.twilio.adapter;

import com.foodcourt.messaging_service.domain.spi.ISmsClientPort;
import com.foodcourt.messaging_service.infrastructure.configuration.TwilioConfiguration;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TwilioAdapter implements ISmsClientPort {
    private final TwilioConfiguration twilioConfiguration;

    @Override
    public void sendSms(String phone, String message) {
        Twilio.init(
                twilioConfiguration.getAccountSid(),
                twilioConfiguration.getAuthToken()
        );

        Message.creator(
                new com.twilio.type.PhoneNumber(phone),
                new com.twilio.type.PhoneNumber(twilioConfiguration.getTrialNumber()),
                message
        ).create();
    }
}
