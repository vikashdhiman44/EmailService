package com.example.emailservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailDto {
    String from;
    String to;
    String subject;
    String body;
}
