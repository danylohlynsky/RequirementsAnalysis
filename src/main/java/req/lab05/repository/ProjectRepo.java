package req.lab05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import req.lab05.model.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {


}
