package com.tradingplatform.optiontrader;

import org.springframework.boot.SpringApplication;

public class TestOptiontraderApplication {

	public static void main(String[] args) {
		SpringApplication.from(OptiontraderApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
