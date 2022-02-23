package com.lagm.webflux.controller;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lagm.webflux.entity.Factura;

import reactor.core.publisher.Flux;

@RestController
public class FacturasController {

	@GetMapping("/facturas")
	public List<Factura> buscarTodas() {
		List<Factura> listaFacturas = new ArrayList<>();
		listaFacturas.add(new Factura(1, "ordenador", 200));
		listaFacturas.add(new Factura(2, "tablet", 300));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		return listaFacturas;
	}
	
	@GetMapping("/facturasWebflux")
	public Flux<Factura> buscarTodasWebflux() {
		Flux<Factura> lista = Flux.just(
				new Factura(1, "ordenador", 200),
				new Factura(2, "tablet", 300)).delaySequence(Duration.ofSeconds(3));
		return lista;
	}
	
}
