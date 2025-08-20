package com.foodcourt.messaging_service.domain.spi;

public interface ISmsClientPort {
    void sendSms(String phone, String message);
}
