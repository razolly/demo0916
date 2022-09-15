package com.example.demo0916.repository;

import com.example.demo0916.entity.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long> {

    Quote findById(long id);

    List<Quote> findByPerson(String person);

}
