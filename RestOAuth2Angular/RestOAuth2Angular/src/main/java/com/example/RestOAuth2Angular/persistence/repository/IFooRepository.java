package com.example.RestOAuth2Angular.persistence.repository;

import com.example.RestOAuth2Angular.persistence.model.Foo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
