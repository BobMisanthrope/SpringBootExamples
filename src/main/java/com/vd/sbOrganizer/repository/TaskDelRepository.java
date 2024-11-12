package com.vd.sbOrganizer.repository;

import com.vd.sbOrganizer.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDelRepository extends JpaRepository<Task, Integer> {
}
