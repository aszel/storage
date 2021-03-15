package com.martin.demo.controller;

import com.martin.demo.domain.Container;
import com.martin.demo.service.ContainerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/containers")
public class ContainerController {

    private final ContainerService containerService;

    ContainerController(ContainerService containerService) {
        this.containerService = containerService;
    }

    @GetMapping
    public List<Container> findAll() {
        return containerService.getAllContainers();
    }

    @GetMapping(value = "/{id}")
    public Container findById(@PathVariable("id") Long id) {
        if (this.containerService.findById(id).isPresent()) {
            return this.containerService.findById(id).get();
        }
        return null;
    }
}
