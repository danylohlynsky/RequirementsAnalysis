package req.lab05.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import req.lab05.model.Requirement;
import req.lab05.repository.RequirementRepo;
import req.lab05.service.interfaces.RequirementService;

import java.util.List;

@Service
public class RequirementServiceImpl implements RequirementService {
    @Autowired
    RequirementRepo requirementRepo;


    @Override
    public void create(Requirement requirement) {
        requirementRepo.save(requirement);
    }

    @Override
    public List<Requirement> getAll() {
        return requirementRepo.findAll();
    }

    @Override
    public Requirement getById(long id) {
        return requirementRepo.getReferenceById(id);
    }
}
