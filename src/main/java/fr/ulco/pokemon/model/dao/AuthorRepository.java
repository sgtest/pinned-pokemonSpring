package fr.ulco.pokemon.model.dao;

import fr.ulco.pokemon.model.entities.AuthorEntity;
import io.vavr.control.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
    Option<AuthorEntity> findByName(final String name);
}
