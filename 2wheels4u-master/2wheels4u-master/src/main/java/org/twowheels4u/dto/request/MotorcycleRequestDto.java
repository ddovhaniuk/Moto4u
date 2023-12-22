package org.twowheels4u.dto.request;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class MotorcycleRequestDto {
    private String model;
    private String manufacturer;
    private BigDecimal fee;
    private String type;
    private Integer inventory;
}
