package com.ornitorrincosystems.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ornitorrincosystems.coursespring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
