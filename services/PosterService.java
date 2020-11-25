package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import edu.poly.spring.models.Poster;
import edu.poly.spring.repositories.PosterRepository;

public interface PosterService {

	void deleteAll();

	void deleteAll(Iterable<? extends Poster> entities);

	void delete(Poster entity);

	void deleteById(String id);

	long count();

	Iterable<Poster> findAllById(Iterable<String> ids);

	Iterable<Poster> findAll();

	boolean existsById(String id);

	Optional<Poster> findById(String id);

	<S extends Poster> Iterable<S> saveAll(Iterable<S> entities);

	<S extends Poster> S save(S entity);

	List<Poster> findByNameLikeOrderByName(String name);

}
