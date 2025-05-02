package com.finalproject.calitatesoftware.repositories;

import com.finalproject.calitatesoftware.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
