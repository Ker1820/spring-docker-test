package com.codedinn.docker.repositories;

import com.codedinn.docker.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, Long> {
}
