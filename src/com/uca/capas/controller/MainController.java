package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.dto.LoginUsuarioDTO;
import com.uca.capas.service.ContribuyenteService;
import com.uca.capas.service.ImportanciaService;

import com.uca.capas.dto.*;

@Controller
public class MainController {

	@Autowired
	ContribuyenteService cs;
	
	@Autowired
	ImportanciaService is;
	
	@RequestMapping(value="/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("listaimportancia", is.findAll());
		mav.addObject("contribuyente", new ContribuyenteDTO());
		mav.setViewName("main");
		return mav;
	}
	
	
	@RequestMapping(value="/ver")
	public ModelAndView vertodo(@ModelAttribute("contribuyente") ContribuyenteDTO c) {
		ModelAndView mav = new ModelAndView();
		cs.insert(c);
		mav.addObject("s", cs.findAll());
		mav.addObject("c", c);
		mav.setViewName("vertodos");
		return mav;
	}
	
	
	@RequestMapping(value="/verTodos")
	public ModelAndView verContribuyentes() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("s", cs.findAll());
		mav.setViewName("vertodos");
		return mav;
	}
}
