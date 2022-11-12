package req.lab05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import req.lab05.model.Requirement;

@Repository
public interface RequirementRepo extends JpaRepository<Requirement, Long> {


}
