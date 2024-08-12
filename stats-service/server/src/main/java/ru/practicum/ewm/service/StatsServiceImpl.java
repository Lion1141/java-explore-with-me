package ru.practicum.ewm.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.practicum.ewm.EndpointHit;
import ru.practicum.ewm.ViewStats;
import ru.practicum.ewm.ViewStatsRequest;
import ru.practicum.ewm.repository.StatsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatsServiceImpl implements StatsService {

    @Qualifier("statsRepository")
    private final StatsRepository statRepository;

    @Override
    public void saveHit(EndpointHit hit) {
        statRepository.saveHit(hit);
    }

    @Override
    public List<ViewStats> getViewStatsList(ViewStatsRequest request) {
        if (request.isUnique()) {
            return statRepository.getUniqueStats(request);
        }

        return statRepository.getStats(request);
    }
}