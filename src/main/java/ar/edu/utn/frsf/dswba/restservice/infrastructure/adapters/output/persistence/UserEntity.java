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
        // Getters y Setters
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
        }
    
        public String getUsername() {
            return username;
        }
    
        public void setUsername(String username) {
            this.username = username;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public String getPassword() {
            return password;
        }
    
        public void setPassword(String password) {
            this.password = password;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public boolean isActive() {
            return active;
        }
    
        public void setActive(boolean active) {
            this.active = active;
        }
    
        public LocalDateTime getCreatedAt() {
            return createdAt;
        }
    
        public void setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
        }
    
        public LocalDateTime getUpdatedAt() {
            return updatedAt;
        }
    
        public void setUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
        }
} 