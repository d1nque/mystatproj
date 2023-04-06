package ua.d1nque.coopproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.d1nque.coopproject.entity.AppUser;
import ua.d1nque.coopproject.entity.Project;
import ua.d1nque.coopproject.entity.ProjectTask;

import java.util.List;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask, Long> {
    List<ProjectTask> getProjectTasksByProject(Project project);
    ProjectTask getProjectTaskById(Long id);
    List<ProjectTask> getProjectTasksByAppUserAndProject(AppUser appUser, Project project);
}
