package net.heanoria.sample.rubrum.controllers;

import net.heanoria.sample.rubrum.persistence.entities.UtilisateurEntity;
import net.heanoria.sample.rubrum.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService = null;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public UtilisateurEntity doPostSaveUser(@RequestBody UtilisateurEntity entity) {
        return utilisateurService.saveUser(entity);
    }
}
