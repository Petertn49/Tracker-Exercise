package com.fanset.interview_exercise;

import com.fanset.interview_exercise.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Service
public class TrackerService {

    @Autowired
    private TrackerRepository trackerRepository;

    @PostConstruct
    @Scheduled(fixedDelay = Long.MAX_VALUE)
    public void loadTrackers() {
        RestTemplate restTemplate = new RestTemplate();
        Tracker[] trackers = restTemplate.getForObject("https://api.navixy.com/v2/tracker/list", Tracker[].class);

        if (trackers != null) {
            for (Tracker tracker : trackers) {
                tracker.setCreationDate(LocalDateTime.now());
                trackerRepository.save(tracker);
            }
        }
    }
}

