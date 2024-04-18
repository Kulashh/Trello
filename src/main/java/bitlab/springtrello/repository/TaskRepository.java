package bitlab.springtrello.repository;

import bitlab.springtrello.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<Tasks, Long> {

    List<Tasks> findAllByFolderId(Long folderId);
}
