package req.lab05.service.interfaces;

import req.lab05.model.Requirement;

import java.util.List;

public interface RequirementService {

    void create(Requirement requirement);
    List<Requirement> getAll();
    Requirement getById(long id);
}
