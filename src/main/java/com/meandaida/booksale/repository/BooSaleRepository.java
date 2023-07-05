package com.meandaida.booksale.repository;

import com.meandaida.booksale.model.BookSalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
@EnableJpaRepositories
public interface BooSaleRepository extends JpaRepository<BookSalesEntity, Integer> {
    //BookSalesEntity savedBooks(BookSalesEntity bookSales);

}
