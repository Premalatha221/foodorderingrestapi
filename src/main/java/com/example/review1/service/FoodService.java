package com.example.review1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.review1.repository.FoodRepo;
import com.example.review1.model.Food;
@Service
public class FoodService 
{
     @Autowired
     FoodRepo ev;
     public Food create(Food e){
      return ev.save(e);
     }
     public List<Food> getAll(){
      return ev.findAll();
     }
     public Food getId(int eid){
      return ev.findById(eid).orElse(null);
     }
     public boolean update(int eid,Food ee){
          if(this.getId(eid)==null)
          {
              return false;
          }
          try{
              ev.save(ee);
          }
          catch(Exception ex)
          {
              return false;
          }
          return  true;
     }
     public boolean delete(int eid){
          if(this.getId(eid)==null){
             return false;
          }
          ev.deleteById(eid);
          return true;
     }
}