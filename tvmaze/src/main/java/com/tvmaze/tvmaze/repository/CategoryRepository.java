package com.tvmaze.tvmaze.repository;

import com.tvmaze.tvmaze.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
