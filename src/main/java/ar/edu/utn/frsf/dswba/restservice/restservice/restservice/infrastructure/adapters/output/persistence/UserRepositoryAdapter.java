package ar.edu.utn.frsf.dswba.infrastructure.adapters.output.persistence;

import ar.edu.utn.frsf.dswba.application.ports.output.UserRepository;
import ar.edu.utn.frsf.dswba.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryAdapter implements UserRepository {
    private final JpaUserRepository jpaUserRepository;
    private final UserMapper userMapper;

    public UserRepositoryAdapter(JpaUserRepository jpaUserRepository, UserMapper userMapper) {
        this.jpaUserRepository = jpaUserRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User save(User user) {
        UserEntity entity = userMapper.toEntity(user);
        UserEntity savedEntity = jpaUserRepository.save(entity);
        return userMapper.toDomain(savedEntity);
    }

    // Implementar los demás métodos...
} 