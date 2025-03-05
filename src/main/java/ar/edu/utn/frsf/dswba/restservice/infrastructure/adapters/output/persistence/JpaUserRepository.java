package ar.edu.utn.frsf.dswba.restservice.infrastructure.adapters.output.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import ar.edu.utn.frsf.dswba.restservice.infrastructure.adapters.output.persistence.UserEntity;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
    boolean existsByEmail(String email);
    Optional<UserEntity> findByEmail(String email);
}