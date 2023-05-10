package com.springbootlearning.learningspringboot3.ch2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//
public interface VideoRepository extends JpaRepository<VideoEntity,Long> {
    List<VideoEntity> findByName(String name);
    List<VideoEntity> findByNameContainsOrDescriptionContainsAllIgnoreCase(String name, String description);
}
