package net.heanoria.sample.rubrum.persistence.repositories;

import net.heanoria.sample.rubrum.persistence.entities.ActivityEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ActivityRepository extends ElasticsearchRepository<ActivityEntity, String> {
}
