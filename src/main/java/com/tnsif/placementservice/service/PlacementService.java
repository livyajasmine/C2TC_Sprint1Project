package com.tnsif.placementservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placementservice.entity.Placement;
import com.tnsif.placementservice.repository.PlacementRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {

    @Autowired
    private PlacementRepository repo;

    // Get all placements
    public List<Placement> listAll() {
        return repo.findAll();
    }

    // Save new placement
    public void save(Placement p) {
        repo.save(p);
    }

    // Get specific placement
    public Placement get(Integer pid) {
        return repo.findById(pid).get();
    }

    // Delete placement
    public void delete(Integer pid) {
        repo.deleteById(pid);
    }

    // Update placement
    public void update(Placement p) {
        repo.save(p);
    }
}
