package ar.edu.utn.frsf.dswba.restservice.application.ports.input;

import ar.edu.utn.frsf.dswba.restservice.domain.model.User;
import java.util.List;
import java.util.Optional;

public interface UserUseCase {
    User createUser(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long id);
    Optional<User> getUserByEmail(String email);
} 