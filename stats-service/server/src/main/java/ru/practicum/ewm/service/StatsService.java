package ru.practicum.ewm.service;

import ru.practicum.ewm.EndpointHit;
import ru.practicum.ewm.ViewStats;
import ru.practicum.ewm.ViewStatsRequest;

import java.util.List;

public interface StatsService {
    void saveHit(EndpointHit hit);

    List<ViewStats> getViewStatsList(ViewStatsRequest request);
}