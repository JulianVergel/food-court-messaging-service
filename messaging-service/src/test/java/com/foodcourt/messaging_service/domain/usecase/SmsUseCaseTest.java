package com.foodcourt.messaging_service.domain.usecase;

import com.foodcourt.messaging_service.domain.model.SmsMessage;
import com.foodcourt.messaging_service.domain.spi.ISmsClientPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class SmsUseCaseTest {

    @Mock
    private ISmsClientPort smsClientPort;

    @InjectMocks
    private SmsUseCase smsUseCase;

    @Test
    void testSendSms_shouldCallSmsClientPort() {
        SmsMessage smsMessage = new SmsMessage("+573001234567", "Your order is ready!");

        smsUseCase.sendSms(smsMessage);

        verify(smsClientPort, times(1)).sendSms(
                "+573001234567",
                "Your order is ready!"
        );
    }
}
