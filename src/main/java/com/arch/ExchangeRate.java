package com.arch;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;
import java.util.Map;

@Data
public class ExchangeRate {
    private Currency base;
    private LocalDate date;
    private Map<Currency, BigDecimal> rates;
}
