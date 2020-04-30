package com.attractor.crud.repository;

import com.attractor.crud.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository <Place, Integer> {
}
