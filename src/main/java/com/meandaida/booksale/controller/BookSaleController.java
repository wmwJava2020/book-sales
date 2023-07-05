package com.meandaida.booksale.controller;

import com.meandaida.booksale.model.BookSalesEntity;
import com.meandaida.booksale.servcies.BookSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/books-sales")
public class BookSaleController {
    @Autowired
    BookSaleService service;

    @PostMapping("/fictions")
    public BookSalesEntity listSavedBooks(@RequestBody BookSalesEntity entity){
       return service.getAllBooks(entity);

    }
   /* @PostMapping("final-sales")
    public BookSalesEntity myBooks(@RequestBody BookSalesEntity bookSales){
        return service.savedBooks(bookSales);
    }*/

}
