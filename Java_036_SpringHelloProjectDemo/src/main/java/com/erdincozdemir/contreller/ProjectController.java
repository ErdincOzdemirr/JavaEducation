package com.erdincozdemir.contreller;

import com.erdincozdemir.model.Project;
import com.erdincozdemir.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/project")
public class ProjectController {
    //http://localhost:8080/api/project
    private final ProjectService projectService;
    //http://localhost:8080/api/project/save
    @PostMapping("/save")
    public void save(@RequestBody Project project) {
        projectService.save(project);
    }
    //http://localhost:8080/api/project/delete
    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAllProject(@RequestBody Project project) {
        projectService.deleteAll();
        return ResponseEntity.ok("Proje başarıyla silindi");
    } // deleteAll çalıştırıldıktan sonra yeni kayıt girmek için application properties de "spring.jpa.hibernate.ddl-auto=create" yapılmalıdırd daha sonra update yapılır.// http://localhost:8080/api/project/delete/1
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") long id) {
        projectService.deleteById(id);
        return ResponseEntity.ok("ID'si " + id + " olan proje başarıyla silindi.");
    }
    /*
    public String deleteById(@PathVariable("id") long id) {
        projectService.deleteById(id);
        return deleteById(id);
    }
    */
    //http://localhost:8080/api/project/update/1
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody Project project) {
        projectService.update(project, id);
        return ResponseEntity.noContent().build();
    }
    //http://localhost:8080/api/project/get/1
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getProject(@PathVariable long id) {
        Project project = projectService.getById(id);
        if (project != null) {
            return ResponseEntity.ok(project);
        } else {
            return ResponseEntity.ok("Veritabanında belirtilen ID'ye ait proje bulunamadı.");
        }
    }
    //http://localhost:8080/api/project/getAll
    @GetMapping("/getAll")
    public ResponseEntity<?> getAllProject() {
        List<Project> projectList = projectService.getAll();
        if (projectList != null && !projectList.isEmpty()) {
            return ResponseEntity.ok(projectList);
        } else {
            return ResponseEntity.ok("Veritabanı boş.");
        }
    }
}

