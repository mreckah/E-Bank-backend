package com.example.ebankbackend.dtos;

import com.example.ebankbackend.enums.OperationType;
import lombok.Data;

import java.util.Date;

@Data
public class OperationDTO {
    private Long id;
    private Date date;
    private double amount;
    private OperationType type;
    private String description;
}
