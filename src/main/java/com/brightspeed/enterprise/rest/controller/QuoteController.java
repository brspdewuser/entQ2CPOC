package com.brightspeed.enterprise.rest.controller;

import com.brightspeed.enterprise.rest.DTO.ProductCatalogDTO;
import com.brightspeed.enterprise.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/quote")
public class QuoteController {

@Autowired
    private QuoteService quoteService;
    @RequestMapping("/quote-home")
    @ResponseBody

    // Method
    public String helloWorld()
    {

        // Print statement
        return "Get quote for Voip";
    }
    @RequestMapping(value="/{product-name}/get-quote",method = RequestMethod.GET)
    @ResponseBody

    // Method
    public ResponseEntity<String> getQuoteByProduct(@PathVariable(name = "product-name") String productName)
    {

        // Print statement
        return ResponseEntity.ok(quoteService.getQuote(productName));
    }
}
