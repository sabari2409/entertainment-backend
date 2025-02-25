package com.tvmaze.tvmaze.services;


import com.tvmaze.tvmaze.model.SeasonDetails;
import com.tvmaze.tvmaze.repository.SeasonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ShowsService {

    @Autowired
    private SeasonsRepository seasonsRepository;

    public List<SeasonDetails> getSeasonDetails(int id) {
        return seasonsRepository.findSeasonsAndEpisodes(id);
    }
}
