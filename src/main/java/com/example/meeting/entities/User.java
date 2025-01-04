package com.example.meeting.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.repository.Temporal;

import java.util.Date;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password; // Store hashed password

    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt = new Date();

}
