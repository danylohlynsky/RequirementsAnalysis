package req.lab05.service.interfaces;

import req.lab05.model.GeneralRisk;

import java.util.List;

public interface GeneralRiskService {
    void addAll(List<GeneralRisk> generalRisks);

    List<GeneralRisk> allGeneralRisks();
}
