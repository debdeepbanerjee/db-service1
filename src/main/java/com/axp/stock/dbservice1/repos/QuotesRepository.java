package com.axp.stock.dbservice1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axp.stock.dbservice1.model.Quote;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findByUserName(String username);
}
