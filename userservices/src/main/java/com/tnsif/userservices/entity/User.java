package com.tnsif.userservices.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // 1. Student ID

    private String name;  // 2. Student Name
    private String email; // 3. Email
    private String department; // 4. Department
    private double cgpa;  // 5. CGPA
    private String phone; // 6. Phone Number

    public User() {
    }

    public User(String name, String email, String department, double cgpa, String phone) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.cgpa = cgpa;
        this.phone = phone;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
