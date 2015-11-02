package net.heanoria.sample.rubrum.controllers;

import net.heanoria.sample.rubrum.persistence.entities.ActivityEntity;
import net.heanoria.sample.rubrum.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ActivityController {

    @Autowired
    private ActivityService activityService = null;

    @RequestMapping(value = "/activities", method = RequestMethod.POST)
    public @ResponseBody
    ActivityEntity doPostSaveActivity(@RequestBody ActivityEntity entity) {
        return activityService.saveActivity(entity);
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody
    List<ActivityEntity> doGetActivities() {
        return activityService.findAllActivities();
    }

}