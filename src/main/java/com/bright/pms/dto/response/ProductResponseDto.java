package com.bright.pms.dto.response;

import java.math.BigDecimal;
import java.util.Map;

public record ProductResponseDto(
        String name,
        BigDecimal price
) {
}
