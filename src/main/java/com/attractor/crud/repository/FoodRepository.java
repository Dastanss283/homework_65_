package com.attractor.crud.repository;

import com.attractor.crud.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository <Food, Integer> {
}
