package com.tvmaze.tvmaze.repository;

import com.tvmaze.tvmaze.entity.Category;
import com.tvmaze.tvmaze.entity.CategoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDetailsRepository extends JpaRepository<CategoryDetails, Integer> {
}
