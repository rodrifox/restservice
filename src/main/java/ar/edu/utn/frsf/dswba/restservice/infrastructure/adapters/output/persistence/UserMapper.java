package ar.edu.utn.frsf.dswba.restservice.infrastructure.adapters.output.persistence;

import ar.edu.utn.frsf.dswba.restservice.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    
    public UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setUsername(user.getUsername());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setActive(user.isActive());
        entity.setCreatedAt(user.getCreatedAt());
        entity.setUpdatedAt(user.getUpdatedAt());
        return entity;
    }

    public User toDomain(UserEntity entity) {
        return new User(
            entity.getId(),
            entity.getUsername(),
            entity.getEmail(),
            entity.getPassword(),
            entity.getFirstName(),
            entity.getLastName()
        );
    }
}