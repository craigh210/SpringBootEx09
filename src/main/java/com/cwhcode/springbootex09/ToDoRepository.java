package com.cwhcode.springbootex09;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<Item, Long> {
}
