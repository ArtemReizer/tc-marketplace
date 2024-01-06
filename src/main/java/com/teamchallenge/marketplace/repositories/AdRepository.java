package com.teamchallenge.marketplace.repositories;

import com.teamchallenge.marketplace.models.Ad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRepository extends MongoRepository<Ad, String> {

}
