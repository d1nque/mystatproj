package ua.d1nque.coopproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.d1nque.coopproject.entity.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    boolean existsAppUserByUsername(String username);
    boolean existsAppUserByUsernameAndPassword(String username, String password);

    AppUser getAppUserByUsernameAndPassword(String username, String password);
    AppUser findByUsername(String username);

    AppUser getAppUserById(Long id);

}
