package com.multitenant.bootmultitenant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multitenant.bootmultitenant.config.CustomRequestAttributes;
import com.multitenant.bootmultitenant.dao.Cos;
import com.multitenant.bootmultitenant.dao.CosDAO;

@RestController
public class Home {
	
	@Autowired
	CosDAO cosDAO;
	
	@RequestMapping("/{tenantId}/cos")
	public List<Cos> getAllCoss(){
		System.out.println("Got Mapping");
		return cosDAO.findAll();
	}
}
