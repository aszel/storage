package com.martin.demo.repository;

import com.martin.demo.domain.Container;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContainerRepository extends JpaRepository<Container, Long> {
}
