package net.heanoria.sample.rubrum.services;

import net.heanoria.sample.rubrum.persistence.entities.UtilisateurEntity;
import net.heanoria.sample.rubrum.persistence.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository = null;

    public UtilisateurEntity saveUser(UtilisateurEntity entity) {
        return utilisateurRepository.save(entity);
    }
}
