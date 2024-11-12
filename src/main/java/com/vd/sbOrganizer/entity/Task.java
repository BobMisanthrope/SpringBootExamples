package com.vd.sbOrganizer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;


@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer priorityId;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Task() {
    }

    public Task(Integer id, Integer priorityId, String description, Date date) {
        this.id = id;
        if(priorityId != null) this.priorityId = priorityId;
        else this.priorityId = 0;
        this.description = description;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        if(this.id != null) {
            result.append("Task [id=");
            result.append(id);
            result.append(", priorityId=");
        } else {
            result.append("Task [priorityId=");
        }
        result.append(priorityId);
        result.append(", description=");
        result.append(description);
        result.append(", date=");
        result.append(date);
        result.append("]");
        return result.toString();
    }
}