package pl.kruzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kruzer.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
