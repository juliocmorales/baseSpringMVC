package com.neoris.peliculas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HolaController {
	
@RequestMapping(value="/hola", method=RequestMethod.GET)	
public String goHola() {
	
	return "hola";
}
}
