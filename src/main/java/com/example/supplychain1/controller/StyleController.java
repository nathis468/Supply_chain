package com.example.supplychain1.controller;

import com.example.supplychain1.model.Style;
import com.example.supplychain1.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/style")
public class StyleController {
    @Autowired
    StyleService styleService;
    @GetMapping("/alldata")
    public List<Style> GetAllData(){
        return styleService.getAllData();
    }

    @GetMapping("/databyid/{_id}")
    public Optional<Style> GetById(@PathVariable long _id){
        return styleService.getById(_id);
    }

    @PostMapping("/insert")
    public String InsertData(@RequestBody Style theStyle){
        styleService.save(theStyle);
        return "Inserted successfully";
    }

    @PutMapping("/update")
    public String UpdateData(@RequestBody Style theStyle){
        styleService.save(theStyle);
        return "Updated successfully";
    }

    @DeleteMapping("/delete/{_id}")
    public String delete(@PathVariable long _id){
        styleService.delete(_id);
        return "deleted successfully";
    }

}
