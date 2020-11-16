package com.generation.org.apidemo.service;

import com.generation.org.apidemo.model.User;

public interface UserService
{

    User getUser( String id );

    User save( User user );

    void delete( String id );

}
