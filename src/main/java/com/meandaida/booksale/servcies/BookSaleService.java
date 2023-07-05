package com.meandaida.booksale.servcies;

import com.meandaida.booksale.model.BookSalesEntity;
import com.meandaida.booksale.repository.BooSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class BookSaleService {
    @Autowired
    BooSaleRepository repository;

    public BookSalesEntity getAllBooks(BookSalesEntity entity){

        entity.getBName();
        entity.getBPrice();
        entity.isAvaliable();
        return repository.save(entity);
    }

   /* public BookSalesEntity savedBooks(BookSalesEntity bookSales){
        bookSales.setBName("All-fictions");
        bookSales.setBPrice(100L);
        bookSales.setAvaliable(Boolean.TRUE);
        return repository.savedBooks(bookSales);
    }*/
}
