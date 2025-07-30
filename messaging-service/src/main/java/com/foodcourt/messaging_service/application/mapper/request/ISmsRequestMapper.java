package com.foodcourt.messaging_service.application.mapper.request;

import com.foodcourt.messaging_service.application.dto.request.SmsRequestDto;
import com.foodcourt.messaging_service.domain.model.SmsMessage;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ISmsRequestMapper {
    SmsMessage toSmsMessage(SmsRequestDto smsRequestDto);
}
