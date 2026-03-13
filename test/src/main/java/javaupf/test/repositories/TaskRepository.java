package javaupf.test.repositories;

import javaupf.test.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // No code needed! JpaRepository gives you save(), findAll(), deleteById(), etc.
}