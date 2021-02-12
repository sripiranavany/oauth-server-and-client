package com.sripiranavan.springboot.security.service;

import java.util.Optional;

import com.sripiranavan.springboot.security.persistence.model.Foo;

public interface IFooService {
	Optional<Foo> findById(Long id);

	Foo save(Foo foo);

	Iterable<Foo> findAll();
}
