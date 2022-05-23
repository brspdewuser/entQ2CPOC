package com.brightspeed.enterprise.rest.controller;

import com.brightspeed.enterprise.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    ContractService contractService;

    @RequestMapping(value="/create-contract",method = RequestMethod.GET)
    @ResponseBody

    // Method
    public ResponseEntity<String> createContract()
    {

        contractService.createContract();
        return ResponseEntity.ok("Successfully created contract");
    }
}
