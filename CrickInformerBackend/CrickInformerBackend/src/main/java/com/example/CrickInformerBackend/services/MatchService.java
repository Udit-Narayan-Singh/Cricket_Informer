package com.example.CrickInformerBackend.services;

import com.example.CrickInformerBackend.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    List<Match> getAllMatches();

    List<Match> getLiveMatches();

    List<List<String>> getPointTable();
}
