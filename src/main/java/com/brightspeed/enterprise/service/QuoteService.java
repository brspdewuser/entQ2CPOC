package com.brightspeed.enterprise.service;

import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    public String getQuote(String productId)
    {
        return "Quote for " + productId;
    }
}
