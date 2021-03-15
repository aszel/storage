package com.martin.demo.service;

import com.martin.demo.domain.Item;
import com.martin.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(final ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return this.itemRepository.findAll();
    }

    public Optional<Item> findById(Long id) {
        return this.itemRepository.findById(id);
    }
}
