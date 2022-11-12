package req.lab05.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import req.lab05.model.Risk;
import req.lab05.repository.RiskRepo;
import req.lab05.service.interfaces.RiskService;

import java.util.List;

@Service
public class RiskServiceImpl implements RiskService {
    @Autowired
    RiskRepo riskRepo;

    @Override
    public void addRisks(List<Risk> risks) {
        riskRepo.saveAll(risks);
    }
}
