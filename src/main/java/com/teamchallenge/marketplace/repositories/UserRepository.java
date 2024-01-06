package com.teamchallenge.marketplace.repositories;

import com.teamchallenge.marketplace.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
