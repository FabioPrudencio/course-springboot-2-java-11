package com.ornitorrincosystems.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ornitorrincosystems.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
