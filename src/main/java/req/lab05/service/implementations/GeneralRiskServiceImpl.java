package req.lab05.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import req.lab05.model.GeneralRisk;
import req.lab05.repository.GeneralRiskRepo;
import req.lab05.service.interfaces.GeneralRiskService;

import java.util.List;

@Service
public class GeneralRiskServiceImpl implements GeneralRiskService {
    @Autowired
    GeneralRiskRepo generalRiskRepo;

    @Override
    public void addAll(List<GeneralRisk> generalRisks) {
        generalRiskRepo.saveAll(generalRisks);
    }

    @Override
    public List<GeneralRisk> allGeneralRisks() {
        return generalRiskRepo.findAll();
    }
}
