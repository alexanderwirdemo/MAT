package com.example.MatPro;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdRepository extends CrudRepository<Product, Integer> {
List<Product> findAllByName(String name);
}
