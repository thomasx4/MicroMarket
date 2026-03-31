package com.gestion.micromarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.micromarket.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
    
}
