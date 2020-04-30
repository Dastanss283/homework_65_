package com.attractor.crud.repository;

import com.attractor.crud.model.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FoodTypeRepository extends JpaRepository <FoodType, Integer> {

    @Query("select p from FoodType as p where p.name like CONCAT(:name, '%')")
    public List<FoodType> getByName(String name);
}
