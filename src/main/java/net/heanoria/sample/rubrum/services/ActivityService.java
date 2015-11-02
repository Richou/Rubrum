package net.heanoria.sample.rubrum.services;

import com.google.common.collect.Lists;
import net.heanoria.sample.rubrum.persistence.entities.ActivityEntity;
import net.heanoria.sample.rubrum.persistence.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository = null;

    public ActivityEntity saveActivity(ActivityEntity entity) {
        return activityRepository.save(entity);
    }

    public List<ActivityEntity> findAllActivities() {
        return Lists.newArrayList(activityRepository.findAll());
    }
}
