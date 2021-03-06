package com.brspd.enterprise.edata.rest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.brspd.enterprise.edata.rest.DTO.ProductCatalogDTO;
import com.brspd.enterprise.edata.service.ProductCatalogService;


@Controller
@CrossOrigin(origins = "http://localhost:8080,http://localhost:3000/*")
@RequestMapping("/product-catalog")

public class ProductCatalogController {

	@Autowired
	private ProductCatalogService productCatalogService;
	    
	@RequestMapping(value ="/get-product-catalog", method = RequestMethod.GET)   
	@ResponseBody
	    public  ResponseEntity<List<ProductCatalogDTO>> getProductCatalogItem()
	    {
			
	    	return ResponseEntity.ok(productCatalogService.getAllProductCatalogs());
	    }
	}