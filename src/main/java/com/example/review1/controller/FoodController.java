package com.example.review1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.review1.model.Food;
import com.example.review1.service.FoodService;


@RestController
public class FoodController {
    @Autowired
    FoodService ev;
    @PostMapping("/post/food")
    public ResponseEntity<Food>addelements(@RequestBody Food m)
    {
        Food evt=ev.create(m);
        return new ResponseEntity<>(evt,HttpStatus.CREATED);
    }
    @GetMapping("/get/food")
    public ResponseEntity<List<Food>> showinfo()
    {
        return new ResponseEntity<>(ev.getAll(),HttpStatus.OK);
    }
    @GetMapping("/get/food/{eid}")
    public ResponseEntity<Food> getById(@PathVariable Integer eid)
    {
        Food obj=ev.getId(eid);
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @PutMapping("/put/{eid}")
    public ResponseEntity<Food> putMethodName(@PathVariable("eid") int eid, @RequestBody Food e) {
        if(ev.update(eid,e) == true)
        {
            return new ResponseEntity<>(e,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/delete/{eid}")
    public ResponseEntity<Boolean> delete(@PathVariable("eid") int eid)
    {
        if(ev.delete(eid) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
   
}