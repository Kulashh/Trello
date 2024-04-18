package bitlab.springtrello.repository;

import bitlab.springtrello.model.TaskCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskCategoriesRepository extends JpaRepository<TaskCategories, Long> {
}
