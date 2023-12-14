package com.example.supplychain1.controller;

import com.example.supplychain1.model.Facilities;
import com.example.supplychain1.service.FacilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/facilities")
public class FacilitiesController {
    @Autowired
    FacilitiesService facilitiesService;
    @GetMapping("/alldata")
    public List<Facilities> GetAllData(){
        return facilitiesService.getAllData();
    }

    @GetMapping("/databyid/{_id}")
    public Optional<Facilities> GetById(@PathVariable long _id){
        return facilitiesService.getById(_id);
    }

    @PostMapping("/insert")
    public String InsertData(@RequestBody Facilities theFacilities){
        facilitiesService.save(theFacilities);
        return "Inserted successfully";
    }

    @PutMapping("/update")
    public String UpdateData(@RequestBody Facilities theFacilities){
        facilitiesService.save(theFacilities);
        return "Updated successfully";
    }

    @DeleteMapping("/delete/{_id}")
    public String delete(@PathVariable long _id){
        facilitiesService.delete(_id);
        return "deleted successfully";
    }
}
