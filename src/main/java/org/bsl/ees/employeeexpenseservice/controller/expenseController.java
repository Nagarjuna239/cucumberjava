package org.bsl.ees.employeeexpenseservice.controller;

import org.bsl.ees.employeeexpenseservice.pojo.expenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class expenseController {

	@GetMapping("/ees/expense/{email}")
	
	public ResponseEntity<expenseService> ets(@PathVariable("email")String email)
	{
		
		expenseService es = new expenseService(email, 12);
		return new ResponseEntity<expenseService>(es,HttpStatus.OK);
	}
}
