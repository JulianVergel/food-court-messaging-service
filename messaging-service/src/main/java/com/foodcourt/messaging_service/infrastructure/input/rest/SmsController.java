package com.foodcourt.messaging_service.infrastructure.input.rest;

import com.foodcourt.messaging_service.application.dto.request.SmsRequestDto;
import com.foodcourt.messaging_service.application.handler.ISmsHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.foodcourt.messaging_service.infrastructure.input.doc.SwaggerConstants.*;

@RestController
@RequestMapping("/api/v1/notification")
@RequiredArgsConstructor
public class SmsController {
    private final ISmsHandler smsHandler;

    @Operation(summary = SUMMARY_SEND_SMS)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = RESPONSE_204_DESCRIPTION, content = @Content),
            @ApiResponse(responseCode = "400", description = RESPONSE_400_DESCRIPTION, content = @Content)
    })
    @PostMapping("/send-sms")
    public ResponseEntity<Void> sendSms(@RequestBody SmsRequestDto smsRequestDto) {
        smsHandler.sendSms(smsRequestDto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
