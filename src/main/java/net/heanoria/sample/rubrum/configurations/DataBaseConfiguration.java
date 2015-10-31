package net.heanoria.sample.rubrum.configurations;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("net.heanoria.sample.rubrum.persistence.entities")
@EnableJpaRepositories("net.heanoria.sample.rubrum.persistence.repositories")
public class DataBaseConfiguration {
}
