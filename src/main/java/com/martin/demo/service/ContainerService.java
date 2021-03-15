package com.martin.demo.service;

import com.martin.demo.domain.Container;
import com.martin.demo.repository.ContainerRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ContainerService {

    private final ContainerRepository containerRepository;

    public ContainerService(final ContainerRepository containerRepository) {
        this.containerRepository = containerRepository;
    }

    public List<Container> getAllContainers() {
        return this.containerRepository.findAll();
    }

    public Optional<Container> findById(Long id) {
            return this.containerRepository.findById(id);
    }
}
