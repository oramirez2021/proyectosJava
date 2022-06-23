package io.getarrays.userservice.Repo;

import io.getarrays.userservice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
