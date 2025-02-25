package com.tvmaze.tvmaze.controller;

import com.tvmaze.tvmaze.entity.CategoryDetails;
import com.tvmaze.tvmaze.entity.Seasons;
import com.tvmaze.tvmaze.model.SeasonDetails;
import com.tvmaze.tvmaze.repository.CategoryDetailsRepository;
import com.tvmaze.tvmaze.repository.SeasonsRepository;
import com.tvmaze.tvmaze.services.ShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class ShowsController {

    @Autowired
    private CategoryDetailsRepository categoryDetailsRepository;

    @Autowired
    private ShowsService showsServices;

    @GetMapping("getAllShows")
    public List<CategoryDetails> getAllShows() {
        return categoryDetailsRepository.findAll();
    }

    @GetMapping("shows")
    @ResponseBody
    public List<SeasonDetails> getShowDetails(@RequestParam int id) {
        return showsServices.getSeasonDetails(id);
    }
}
