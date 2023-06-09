package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Magazzino;

@Repository
public interface IMagazzinoRepository  extends CrudRepository<Magazzino, Integer> {
	
	Magazzino findBycodArticolo(String cod_articolo);
	
	
	Magazzino findByidMagazzino(String id_magazzino);
	

}