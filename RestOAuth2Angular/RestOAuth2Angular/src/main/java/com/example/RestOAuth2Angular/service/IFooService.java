package com.example.RestOAuth2Angular.service;

import com.example.RestOAuth2Angular.persistence.model.Foo;

import java.util.Optional;

public interface IFooService {
    Optional<Foo> findById(Long id);

    Foo save(Foo foo);

    Iterable<Foo> findAll();
}
