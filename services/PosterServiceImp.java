package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.spring.models.Poster;
import edu.poly.spring.repositories.PosterRepository;

@Service
public class PosterServiceImp implements PosterService{
	@Autowired
	private PosterRepository posterRepository;
	@Override
	public <S extends Poster> S save(S entity) {
		return posterRepository.save(entity);
	}

	@Override
	public <S extends Poster> Iterable<S> saveAll(Iterable<S> entities) {
		return posterRepository.saveAll(entities);
	}

	@Override
	public Optional<Poster> findById(String id) {
		return posterRepository.findById(id);
	}

	@Override
	public List<Poster> findByNameLikeOrderByName(String name) {
		return posterRepository.findByNameLikeOrderByName("%" + name + "%");
	}

	@Override
	public boolean existsById(String id) {
		return posterRepository.existsById(id);
	}

	@Override
	public Iterable<Poster> findAll() {
		return posterRepository.findAll();
	}

	@Override
	public Iterable<Poster> findAllById(Iterable<String> ids) {
		return posterRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return posterRepository.count();
	}

	@Override
	public void deleteById(String id) {
		posterRepository.deleteById(id);
	}

	@Override
	public void delete(Poster entity) {
		posterRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Poster> entities) {
		posterRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		posterRepository.deleteAll();
	}
	
}
