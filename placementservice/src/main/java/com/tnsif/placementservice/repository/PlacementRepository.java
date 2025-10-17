package com.tnsif.placementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.placementservice.entity.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Integer> {

}
