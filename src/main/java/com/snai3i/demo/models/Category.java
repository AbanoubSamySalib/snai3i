package com.snai3i.demo.models;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(name = "name")
    private String name;
    
    @OneToMany(mappedBy="category",fetch = FetchType.LAZY)
    private List<Worker> workers;

    public Category() {}

    public Category(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public List<Worker> getWorkers() {
		return workers;
	}
    
}
