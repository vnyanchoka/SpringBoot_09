package com.example.demo;

import org.springframework.data.repository.CrudRepository;
public interface JobRepository extends CrudeRepository<Job, Long> {
}
