package com.meandaida.booksale.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookSalesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int bId;
    private String bName;
    private double bPrice;
    private boolean isAvaliable;

}
