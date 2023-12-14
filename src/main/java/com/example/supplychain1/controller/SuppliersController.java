package com.example.supplychain1.controller;

import com.example.supplychain1.model.Suppliers;
import com.example.supplychain1.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/suppliers")
public class SuppliersController {
    @Autowired
    SuppliersService suppliersService;
    @GetMapping("/alldata")
    public List<Suppliers> GetAllData(){
        return suppliersService.getAllData();
    }

    @GetMapping("/databyid/{_id}")
    public Optional<Suppliers> GetById(@PathVariable long _id){
        return suppliersService.getById(_id);
    }

    @PostMapping("/insert")
    public String InsertData(@RequestBody Suppliers theSuppliers){
        suppliersService.save(theSuppliers);
        return "Inserted successfully";
    }

    @PutMapping("/update")
    public String UpdateData(@RequestBody Suppliers theSuppliers){
        suppliersService.save(theSuppliers);
        return "Updated successfully";
    }

    @DeleteMapping("/delete/{_id}")
    public String delete(@PathVariable long _id){
        suppliersService.delete(_id);
        return "deleted successfully";
    }
}
