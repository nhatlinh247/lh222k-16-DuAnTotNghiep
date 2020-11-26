package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.spring.models.Book;
import edu.poly.spring.repositories.BookRepository;

@Service
public class BookServiceImp implements BookService{
	@Autowired
	private BookRepository bookRepository;
	@Override
	public <S extends Book> S save(S entity) {
		return bookRepository.save(entity);
	}

	@Override
	public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
		return bookRepository.saveAll(entities);
	}

	@Override
	public Optional<Book> findById(String id) {
		return bookRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return bookRepository.existsById(id);
	}


	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Iterable<Book> findAllById(Iterable<String> ids) {
		return bookRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return bookRepository.count();
	}

	@Override
	public void deleteById(String id) {
		bookRepository.deleteById(id);
	}

	@Override
	public void delete(Book entity) {
		bookRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Book> entities) {
		bookRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		bookRepository.deleteAll();
	}

	@Override
	public List<Book> findByNameLikeOrderByName(String name) {
		return bookRepository.findByNameLikeOrderByName("%" + name + "%");
	}
	
}
