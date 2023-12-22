package org.twowheels4u.dto.request;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class RentalRequestDto {
    private LocalDateTime returnDate;
    private LocalDateTime rentalDate;
    private Long motorcycleId;
}
