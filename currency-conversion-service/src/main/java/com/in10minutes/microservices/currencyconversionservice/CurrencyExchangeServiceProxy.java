package com.in10minutes.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="currency-exchange-service", url="localhost:5556")
public interface CurrencyExchangeServiceProxy {

}
