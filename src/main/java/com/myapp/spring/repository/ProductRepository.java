package com.myapp.spring.repository;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import com.myapp.spring.entity.ProductEntity;

public interface ProductRepository extends ReactiveCassandraRepository<ProductEntity, String> {

	
}
