package ua.d1nque.coopproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.d1nque.coopproject.entity.AppUser;
import ua.d1nque.coopproject.entity.AppUserHasProject;
import ua.d1nque.coopproject.entity.Project;

import java.util.List;

@Repository
public interface AppUserHasProjectRepository extends JpaRepository<AppUserHasProject, Long> {
    boolean existsAppUserHasProjectByAppUserAndProject(AppUser appUser, Project project);
    List<AppUserHasProject> getAppUserHasProjectsByProject(Project project);
    AppUserHasProject getAppUserHasProjectByAppUserAndProject(AppUser appuser, Project project);

}
