package req.lab05.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import req.lab05.model.Project;
import req.lab05.repository.ProjectRepo;
import req.lab05.service.interfaces.ProjectService;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepo projectRepo;

    @Override
    public Project create(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public List<Project> getAll() {
        return projectRepo.findAll();
    }

    @Override
    public Project getById(Long id) {
        return projectRepo.getReferenceById(id);
    }


}
