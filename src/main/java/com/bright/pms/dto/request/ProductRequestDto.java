package com.bright.pms.dto.request;

import java.math.BigDecimal;

public record ProductRequestDto(
        String name,
        BigDecimal price
) {
}
