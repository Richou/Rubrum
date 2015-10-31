package net.heanoria.sample.rubrum.persistence.repositories;

import net.heanoria.sample.rubrum.persistence.entities.UtilisateurEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UtilisateurRepository extends JpaRepository<UtilisateurEntity, UUID> {
}
