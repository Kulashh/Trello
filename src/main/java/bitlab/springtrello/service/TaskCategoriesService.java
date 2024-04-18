package bitlab.springtrello.service;

import bitlab.springtrello.model.TaskCategories;
import bitlab.springtrello.repository.TaskCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskCategoriesService {
    @Autowired
    private TaskCategoriesRepository taskCategoriesRepository;
    public List<TaskCategories> getAllTaskCategories(){
        return taskCategoriesRepository.findAll();
    }
}