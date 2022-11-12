package req.lab05.service.interfaces;

import req.lab05.model.Project;

import java.util.List;

public interface ProjectService {

    Project create(Project project);

    List<Project> getAll();

    Project getById(Long id);
}
