package ar.edu.utn.frsf.dswba.restservice.infrastructure.adapters.output.persistence;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters y Setters
} 