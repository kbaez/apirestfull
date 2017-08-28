package com.kbaez.practica.repository;

import org.springframework.data.repository.CrudRepository;

import com.kbaez.practica.model.Film;

public interface FilmRepository extends CrudRepository<Film, Long>{

}
