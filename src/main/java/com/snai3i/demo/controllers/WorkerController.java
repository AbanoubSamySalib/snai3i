package com.snai3i.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.snai3i.demo.exceptions.WorkerNotFoundException;
import com.snai3i.demo.models.Worker;
import com.snai3i.demo.repositories.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerController {
    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping("/")
    public Iterable<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Worker getWorkerById(@PathVariable Long id) {
        return workerRepository.findById(id).orElseThrow(() -> new WorkerNotFoundException(id));
    }

    @PostMapping("/")
    public Worker createWorker(@RequestBody Worker worker) {
        return workerRepository.save(worker);
    }

    @PutMapping("/{id}")
    public Worker updateWorker(@PathVariable Long id, @RequestBody Worker updatedWorker) {
        Worker worker = workerRepository.findById(id).orElseThrow(() -> new WorkerNotFoundException(id));
        worker.setName(updatedWorker.getName());
        worker.setPhoneNumber1(updatedWorker.getPhoneNumber1());
        worker.setPhoneNumber2(updatedWorker.getPhoneNumber2());
        worker.setCategory(updatedWorker.getCategory());
        return workerRepository.save(worker);
    }

    @DeleteMapping("/{id}")
    public void deleteWorker(@PathVariable Long id) {
        workerRepository.deleteById(id);
    }
    
    @GetMapping("/{categoryId}/workers")
    public List<Worker> getWorkersByCategoryId(@PathVariable Long categoryId) {
        return workerRepository.findByCategoryId(categoryId);
    }
}
