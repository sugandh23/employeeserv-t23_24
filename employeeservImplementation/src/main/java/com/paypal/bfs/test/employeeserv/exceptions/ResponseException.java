package com.paypal.bfs.test.employeeserv.exceptions;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseException {
    private String field;
    private String message;
}
