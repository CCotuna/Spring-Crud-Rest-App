package com.finalproject.calitatesoftware.repositories;

import com.finalproject.calitatesoftware.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
