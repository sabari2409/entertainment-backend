package com.tvmaze.tvmaze.controller;

import com.tvmaze.tvmaze.entity.CategoryDetails;
import com.tvmaze.tvmaze.repository.CategoryDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class ShowsController {

    @Autowired
    private CategoryDetailsRepository categoryDetailsRepository;

    @GetMapping("getAllShows")
    public List<CategoryDetails> getAllShows() {
        return categoryDetailsRepository.findAll();
    }
}
