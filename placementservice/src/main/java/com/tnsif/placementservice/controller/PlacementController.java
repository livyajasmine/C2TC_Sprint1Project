package com.tnsif.placementservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tnsif.placementservice.entity.Placement;
import com.tnsif.placementservice.service.PlacementService;

import jakarta.persistence.NoResultException;

@RestController
public class PlacementController {

    @Autowired
    private PlacementService p;

    @GetMapping("/placementservice")
    public List<Placement> list() {
        return p.listAll();
    }

    @PostMapping("/placementservice")
    public void add(@RequestBody Placement p1) {
        p.save(p1);
    }

    @GetMapping("/placementservice/{id}")
    public ResponseEntity<Placement> get(@PathVariable Integer id) {
        try {
            Placement p2 = p.get(id);
            return new ResponseEntity<Placement>(p2, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/placementservice/{id}")
    public void delete(@PathVariable Integer id) {
        p.delete(id);
    }

    @PutMapping("/placementservice/{id}")
    public ResponseEntity<Placement> update(@PathVariable Integer id, @RequestBody Placement update_p) {
        try {
            Placement exist_p = p.get(id);
            exist_p.setCompanyName(update_p.getCompanyName());
            exist_p.setRole(update_p.getRole());
            exist_p.setPackageOffered(update_p.getPackageOffered());
            exist_p.setLocation(update_p.getLocation());
            exist_p.setEligibility(update_p.getEligibility());
            p.update(exist_p);
            return new ResponseEntity<Placement>(exist_p, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
        }
    }
}
