package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.poly.spring.models.PublishingCompany;
import edu.poly.spring.repositories.PublishingCompanyRepository;

@Service
public class PublishingCompanyServiceImp implements PublishingCompanyService{
	private PublishingCompanyRepository companyRepository;

	@Override
	public <S extends PublishingCompany> S save(S entity) {
		return companyRepository.save(entity);
	}

	@Override
	public <S extends PublishingCompany> Iterable<S> saveAll(Iterable<S> entities) {
		return companyRepository.saveAll(entities);
	}

	@Override
	public Optional<PublishingCompany> findById(String id) {
		return companyRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return companyRepository.existsById(id);
	}

	@Override
	public Iterable<PublishingCompany> findAll() {
		return companyRepository.findAll();
	}

	@Override
	public List<PublishingCompany> findByNameLikeOrderByName(String name) {
		return companyRepository.findByNameLikeOrderByName("%" + name + "%");
	}

	@Override
	public Iterable<PublishingCompany> findAllById(Iterable<String> ids) {
		return companyRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return companyRepository.count();
	}

	@Override
	public void deleteById(String id) {
		companyRepository.deleteById(id);
	}

	@Override
	public void delete(PublishingCompany entity) {
		companyRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends PublishingCompany> entities) {
		companyRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		companyRepository.deleteAll();
	}

}
