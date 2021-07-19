package io.agileintelligence.ppmtool.repository;

import io.agileintelligence.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * ProjectRepository
 *
 * @author JJJ
 * @date 7/19/21 5:02 PM
 * @email jiangjinjinyxt@gmail.com
 * @since 1.0.0
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
