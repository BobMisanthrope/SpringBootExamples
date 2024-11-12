package com.vd.sbOrganizer.repository;

import com.vd.sbOrganizer.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskGetAllRepository extends JpaRepository<Task, Integer> {

}
