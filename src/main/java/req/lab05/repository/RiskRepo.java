package req.lab05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import req.lab05.model.Risk;

public interface RiskRepo extends JpaRepository<Risk, Long> {

}
