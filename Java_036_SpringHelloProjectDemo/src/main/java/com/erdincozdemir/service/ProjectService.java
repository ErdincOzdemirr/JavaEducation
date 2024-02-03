package com.erdincozdemir.service;

import com.erdincozdemir.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    Project save(Project project);
    void deleteAll();
    void deleteById(Long id);
    void update(Project project, Long id);
    Project getById(Long id);
    List<Project> getAll();


}
