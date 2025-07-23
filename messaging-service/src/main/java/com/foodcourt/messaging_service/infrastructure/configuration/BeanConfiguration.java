package com.foodcourt.messaging_service.infrastructure.configuration;

import com.foodcourt.messaging_service.domain.api.ISmsServicePort;
import com.foodcourt.messaging_service.domain.spi.ISmsClientPort;
import com.foodcourt.messaging_service.domain.usecase.SmsUseCase;
import com.foodcourt.messaging_service.infrastructure.output.twilio.adapter.TwilioAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final TwilioConfiguration twilioConfiguration;

    @Bean
    public ISmsClientPort smsClientPort() {
        return new TwilioAdapter(twilioConfiguration);
    }

    @Bean
    public ISmsServicePort smsServicePort() {
        return new SmsUseCase(smsClientPort());
    }
}
