package ar.edu.utn.frsf.dswba.application.usecases;

import ar.edu.utn.frsf.dswba.restservice.domain.model.User;
import ar.edu.utn.frsf.dswba.restservice.application.ports.input.UserUseCase;
import ar.edu.utn.frsf.dswba.restservice.infrastructure.adapters.output.persistence.UserRepositoryAdapter;
import ar.edu.utn.frsf.dswba.restservice.application.ports.output.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserUseCase {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        if (!userRepository.findById(user.getId()).isPresent()) {
            throw new IllegalArgumentException("User not found");
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
} 