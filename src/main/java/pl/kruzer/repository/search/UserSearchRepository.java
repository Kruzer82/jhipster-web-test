package pl.kruzer.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import pl.kruzer.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
