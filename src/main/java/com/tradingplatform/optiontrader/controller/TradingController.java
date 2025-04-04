package com.tradingplatform.optiontrader.controller;

import com.tradingplatform.optiontrader.api.ApiService;
import com.tradingplatform.optiontrader.model.Option;
import com.tradingplatform.optiontrader.model.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TradingController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/options")
    public String getOptions(Model model) {
        List<Option> options = apiService.fetchOptions();
        model.addAttribute("options", options);
        return "options";
    }

    @GetMapping("/trades")
    public String getTrades(Model model) {
        List<Trade> trades = apiService.fetchTrades();
        model.addAttribute("trades", trades);
        return "trades";
    }
}