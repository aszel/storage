package com.martin.demo.controller;

import com.martin.demo.domain.Item;
import com.martin.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> findAll() {
        return this.itemService.getAllItems();
    }

    @GetMapping(value = "/{id}")
    public Item findById(@PathVariable("id") Long id) {
        if (this.itemService.findById(id).isPresent()) {
            return this.itemService.findById(id).get();
        }
        return null;
    }
}