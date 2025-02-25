package com.tvmaze.tvmaze.repository;

import com.tvmaze.tvmaze.entity.Episodes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodesRepository extends JpaRepository<Episodes, Integer> {
}
