package io.getarrays.userservice.service;

import io.getarrays.userservice.Repo.UserRepo;
import io.getarrays.userservice.Repo.RolRepo;
import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;
    private final RolRepo roleRepo;

    @Override
    public User saveUser(User user) {
        log.info("saving new user {} to the database ",user.getUserName());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("saving new role {} to the database ",role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String unsername, String roleName) {
        log.info("Adding role {} to the user {} ",roleName,unsername);
        User user = userRepo.findByUserName(unsername);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("Fetching user {} ",username);
        return userRepo.findByUserName(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }
}
