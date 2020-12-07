package com.live.kafka.consumer.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarDTO {

    private String id;
    private String model;
    private String color;

}