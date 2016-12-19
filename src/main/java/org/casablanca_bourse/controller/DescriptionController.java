package org.casablanca_bourse.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DescriptionController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public ResponseEntity<Object> getRoot(@PathVariable("id") String name) throws IOException {
		Map<String,String> desc = new HashMap<String, String>();
		desc.put("companies", "/api/v1/companies");
		return new ResponseEntity<Object>(desc,HttpStatus.OK);
	}
}
