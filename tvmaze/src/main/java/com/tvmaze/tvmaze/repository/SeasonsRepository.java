package com.tvmaze.tvmaze.repository;

import com.tvmaze.tvmaze.entity.Seasons;
import com.tvmaze.tvmaze.model.SeasonDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SeasonsRepository extends JpaRepository<Seasons, Integer> {
    List<Seasons> findByCategoryDetails_Id(int categoryDetailsId);

    @Query(nativeQuery = true,
    value = "select s.id as seasonId, s.name as seasonName,e.id as episodeId,e.episode_no as episodeNo, e.name as episodeName, e.score as episodeScore, e.status as episodeStatus from seasons as s, episodes as e where s.category_details_id = :categoryDetailsId and s.id = e.season_id")
    List<SeasonDetails> findSeasonsAndEpisodes(@Param("categoryDetailsId") int categoryDetailsId);
}
