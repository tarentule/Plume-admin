package com.coreoz.plume.admin.services.logApi;



import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class LogApiBean {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    private String api;
    private String url;
    private Instant date;
    private String method;
    private String statusCode;
    private String bodyRequest;
    private String bodyResponse;
    private LogHeaderBean headerRequest;
    private LogHeaderBean headerResponse;
    private Boolean IsCompleteTextRequest;
    private Boolean IsCompleteTextResponse;
}
