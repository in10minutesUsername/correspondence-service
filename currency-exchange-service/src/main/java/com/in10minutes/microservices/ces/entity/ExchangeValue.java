package com.in10minutes.microservices.ces.entity;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ExchangeValue {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

}
