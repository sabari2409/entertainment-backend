package com.tvmaze.tvmaze.model;

public class SeasonDetails {

    private int seasonId;
    private String seasonName;
    private int episodeId;
    private String episodeName;
    private double episodeScore;
    private String episodeStatus;
    private int episodeNo;


    SeasonDetails(int sId, String sName, int  eId, int eNo, String eName, double eScore, String eStatus) {
        this.seasonId = sId;
        this.seasonName = sName;
        this.episodeId = eId;
        this.episodeName = eName;
        this.episodeScore = eScore;
        this.episodeStatus = eStatus;
        this.episodeNo = eNo;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public double getEpisodeScore() {
        return episodeScore;
    }

    public void setEpisodeScore(double episodeScore) {
        this.episodeScore = episodeScore;
    }

    public String getEpisodeStatus() {
        return episodeStatus;
    }

    public void setEpisodeStatus(String episodeStatus) {
        this.episodeStatus = episodeStatus;
    }

    public int getEpisodeNo() {
        return episodeNo;
    }

    public void setEpisodeNo(int episodeNo) {
        this.episodeNo = episodeNo;
    }

}
