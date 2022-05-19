package com.brightspeed.enterprise.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.brightspeed.enterprise.rest.DTO.ProductCatalogDTO;

@Service
public class ProductCatalogService {
	
	public List<ProductCatalogDTO> getAllProductCatalogs()
	{
		List<ProductCatalogDTO> productCatalogs = new ArrayList<>();
		ProductCatalogDTO productCatalogDTO = new ProductCatalogDTO();
		productCatalogDTO.setAsscUsoc("U089");
		productCatalogDTO.setCategory("Data");
		productCatalogDTO.setDescription("Ethernet private line " );
		productCatalogDTO.setBusinessType("Enterprise");
		productCatalogDTO.setPrdCtlgId(Long.valueOf(1));
		productCatalogDTO.setProductName("Ethernet");
		productCatalogs.add(productCatalogDTO);
	
	return productCatalogs;
	}

}
