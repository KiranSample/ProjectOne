package com.kiran.stock.stockService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController 
{
	
	@GetMapping("/{userName}")
	public String getDetails(@PathVariable("userName") final String userName)
	{
		return "From Stock Micorservice Value is->"+userName;
		
	}

}
