package com.snai3i.demo.models;
import jakarta.persistence.*;


@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private Long id;
    private String name;
    private String phoneNumber1;
    private String phoneNumber2;
    @ManyToOne
    private Category category;

    protected Worker() {}

    public Worker(String name, String phoneNumber1, String phoneNumber2, Category category) {
        this.name = name;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }
    
    public Category getCategory()
    {
    	return category;
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
    
}
