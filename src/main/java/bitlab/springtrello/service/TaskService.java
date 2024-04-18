package bitlab.springtrello.service;

import bitlab.springtrello.model.Tasks;
import bitlab.springtrello.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    //тут вытаскиваем весь список таска
    public List<Tasks> getAllTasks(){
        return taskRepository.findAll();
    }

    public Tasks getTaskById(Long id){
        return taskRepository.findById(id).orElse(null);

    }
    public void addTask(Tasks task){
        taskRepository.save(task); 
    }

    public List<Tasks> getAllTasksByFolder(Long folderId){
        return taskRepository.findAllByFolderId(folderId);
    }
}