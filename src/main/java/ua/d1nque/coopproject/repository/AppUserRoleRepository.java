package ua.d1nque.coopproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.d1nque.coopproject.entity.AppUserRole;

@Repository
public interface AppUserRoleRepository extends JpaRepository<AppUserRole, Long> {
    AppUserRole findAppUserRoleByRoleName(String roleName);

}
