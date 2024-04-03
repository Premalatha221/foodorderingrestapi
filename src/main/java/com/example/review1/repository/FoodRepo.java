package com.example.review1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.review1.model.Food;
public interface FoodRepo extends JpaRepository<Food,Integer> {

}