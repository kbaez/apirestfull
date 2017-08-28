package com.kbaez.practica.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kbaez.practica.model.Film;
import com.kbaez.practica.repository.FilmRepository;

@Controller
@RestController
@RequestMapping(value = "/films")
public class FilmsController {
	@Autowired
	private FilmRepository filmRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public  @ResponseBody Iterable<Film> getFilms() {
		return filmRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public  @ResponseBody String addFilm(@RequestBody @Valid Film film) {
		filmRepository.save(film);
		return "Saved";
	}	
}