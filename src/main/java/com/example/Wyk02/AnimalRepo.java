package com.example.Wyk02;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepo extends CrudRepository<Animal, Long>
{
}
