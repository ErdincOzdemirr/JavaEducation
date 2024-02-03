package com.erdincozdemir.service;

import com.erdincozdemir.model.Project;
import com.erdincozdemir.repository.ProjectRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService{

    private final ProjectRepository projectRepository;

    @Override
    public Project save(Project project) {
        projectRepository.save(project);
        return project;
    }
    @Override
    public void deleteAll() {
        projectRepository.deleteAll();
    }
    @Override
    public void deleteById(Long id) {
        Project existingProject = projectRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Project not found"));
        projectRepository.deleteById(id);
    }
    @Override
    public void update(Project project, Long id) {
    projectRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user id " + id));
    project.setId(id);
    projectRepository.save(project);
    }
    @Override
    public Project getById(Long id) {
        Optional<Project> projectResult = projectRepository.findById(id);
        return projectResult.orElse(null);
    }
    @Override
    public List<Project> getAll() {
        List<Project> projectList = projectRepository.findAll();
        System.out.println("Getting Data From Database :" + projectList);
        return projectList;
    }
}
