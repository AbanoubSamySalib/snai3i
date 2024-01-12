package com.snai3i.demo.repositories;
import org.springframework.data.repository.CrudRepository;

import com.snai3i.demo.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {}
