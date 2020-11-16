package com.generation.org.apidemo.repository;

import com.generation.org.apidemo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
    extends CrudRepository<User, String>
{

}
