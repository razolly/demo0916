package com.example.demo0916.repository;

import com.example.demo0916.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long> {

    Quote findById(long id);

    List<Quote> findByFrom(String from);

}
