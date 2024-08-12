package ru.practicum.ewm.repository;

import org.springframework.stereotype.Repository;
import ru.practicum.ewm.EndpointHit;
import ru.practicum.ewm.ViewStats;
import ru.practicum.ewm.ViewStatsRequest;

import java.util.List;

@Repository
public interface StatsRepository {
    void saveHit(EndpointHit hit);

    List<ViewStats> getStats(ViewStatsRequest request);

    List<ViewStats> getUniqueStats(ViewStatsRequest request);
}
