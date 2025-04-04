package com.tradingplatform.optiontrader.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TradingRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:fetchOptions?period=60000")
                .to("bean:apiService?method=fetchOptions")
                .log("Fetched options: ${body}");

        from("timer:fetchTrades?period=60000")
                .to("bean:apiService?method=fetchTrades")
                .log("Fetched trades: ${body}");
    }
}