package com.arch;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Currency;

@FeignClient(value = "exchange-rate", url = "${feign.client.config.exchange-rate.url}")
public interface ExchangeRateClient {

    @GetMapping(value = "/latest")
    ExchangeRate getLatest();

    @GetMapping(value = "/{date}")
    ExchangeRate getByDate(@PathVariable("date") String date);

    @GetMapping(value = "/latest")
    ExchangeRate getByBaseCurrency(@RequestParam(value = "base") Currency currency);
}
