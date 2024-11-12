package com.vd.sbOrganizer.service;

import com.vd.sbOrganizer.entity.Task;
import com.vd.sbOrganizer.repository.TaskGetAllRepository;
import com.vd.sbOrganizer.repository.TaskSaveRepository;
import com.vd.sbOrganizer.repository.TaskDelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TaskService {

    @Autowired
    private TaskGetAllRepository taskRepository;
    @Autowired
    private TaskSaveRepository taskSaveRepository;
    @Autowired
    private TaskDelRepository taskDelRepository;

    public List getAll() {
        return taskRepository.findAll(Sort.by(Sort.Order.asc("date"),
                Sort.Order.desc("priorityId")));
    }

    public Task save(Task task) {
        System.out.println("TaskService.save: " + task.toString());
        return (Task) taskRepository.save(task);
    }

    public void delete(int id) {
        System.out.println("TaskService.delete: -> id = " + id);
        taskRepository.deleteById(id);
    }

}
