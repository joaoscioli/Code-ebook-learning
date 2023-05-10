package com.springbootlearning.learningspringboot3.ch2;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {

    private List<Video> videos = List.of(
            new Video("Need HELP with your SPRING BOOT 3 App?"),
            new Video("Don't to THIS to your own CODE!"),
            new Video("SECRETS to fix BROKEN CODE!")
    );


    public List<Video> getVideos() {
        return videos;
    }

    public Video create (Video newVideo) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(newVideo);
        this.videos = List.copyOf(extend);
        return newVideo;
    }

    public List<VideoEntity> search(VideoSearch videoSearch) {
        if (StringUtils.hasText(videoSearch.name()) && StringUtils.hasText(videoSearch.description())) {
            return repository.findByNameContainsOrDescriptionContainsAllIgnoreCase(
                    videoSearch.name(), videoSearch.description());
        }
    }
}
