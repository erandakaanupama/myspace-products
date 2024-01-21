package com.eab.myspaceproducts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto<T> {
    private T data;
    private String statusCode;
    private String statusMsg;
}
