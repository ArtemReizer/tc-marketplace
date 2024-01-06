package com.teamchallenge.marketplace.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "ads")
public class Ad {
    @Id
    private String id;
    private String title;
    private String description;
    private String image;
    private Double price;
    private LocalDate postingDate;

}
