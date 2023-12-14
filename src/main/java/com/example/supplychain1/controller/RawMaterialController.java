package com.example.supplychain1.controller;

import com.example.supplychain1.model.RawMaterial;
import com.example.supplychain1.service.RawMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rawmaterial")
public class RawMaterialController {
    @Autowired
    RawMaterialService rawMaterialService;
    @GetMapping("/alldata")
    public List<RawMaterial> GetAllData(){
        return rawMaterialService.getAllData();
    }

    @GetMapping("/databyid/{_id}")
    public Optional<RawMaterial> GetById(@PathVariable long _id){
        return rawMaterialService.getById(_id);
    }

    @PostMapping("/insert")
    public String InsertData(@RequestBody RawMaterial theRawMaterial){
        rawMaterialService.save(theRawMaterial);
        return "Inserted successfully";
    }

    @PutMapping("/update")
    public String UpdateData(@RequestBody RawMaterial theRawMaterial){
        rawMaterialService.save(theRawMaterial);
        return "Updated successfully";
    }

    @DeleteMapping("/delete/{_id}")
    public String delete(@PathVariable long _id){
        rawMaterialService.delete(_id);
        return "deleted successfully";
    }
}
