package com.lae.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lae.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Leonardo","Paoletti","leo"));
		lista.add(new Contatto("Matteo","Perini","mat"));
		lista.add(new Contatto("David","Signorotti","dav"));
		lista.add(new Contatto("Simone","Ricci","sim"));
		return lista;
	}

}
