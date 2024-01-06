package com.teamchallenge.marketplace.repositories;

import com.teamchallenge.marketplace.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {

}
