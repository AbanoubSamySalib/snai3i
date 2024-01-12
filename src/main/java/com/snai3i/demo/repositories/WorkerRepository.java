package com.snai3i.demo.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.snai3i.demo.models.Worker;

public interface WorkerRepository extends CrudRepository<Worker, Long> {
	 List<Worker> findByCategoryId(Long categoryId);
}
