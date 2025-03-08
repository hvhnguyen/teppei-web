package com.teppei.kendo.teppei_kendo_shop.service;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import com.teppei.kendo.teppei_kendo_shop.model.Shinai;
import com.teppei.kendo.teppei_kendo_shop.repository.ShinaiRepository;

public class ShinaiService {
	private final ShinaiRepository shinaiRepository;
	
	public ShinaiService(ShinaiRepository shinaiRepository) {
		this.shinaiRepository = shinaiRepository;
	}
	
	public List<Shinai> getAllShinai() {
		return shinaiRepository.findAll();
	}
	
	public Shinai getShinaiById(Long id) {
		return shinaiRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Shinai not found!"));
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	public Shinai createShinai(Shinai shinai) {
		return shinaiRepository.save(shinai);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteShinai(Long id) {
	    shinaiRepository.deleteById(id);
	}
	
}
