package com.backend.rootly.repository;

import com.backend.rootly.entity.UserReg;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserReg,String> {
}
