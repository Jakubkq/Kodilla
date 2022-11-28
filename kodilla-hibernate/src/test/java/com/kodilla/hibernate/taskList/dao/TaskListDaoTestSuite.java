package com.kodilla.hibernate.taskList.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.taskList.Dao.TaskListDao;
import com.kodilla.hibernate.taskList.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;
    private static final String LISTNAME = "Trial listName";
    private static final String DESCRIPTION = "Description of trial listName";
    private TaskList tasklist;


    @Test
    public void testTaskListDaoSave(){
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        //When
        taskListDao.save(taskList);
        //Then
        int id = tasklist.getId();
        Optional<TaskList> readTaskList = taskListDao.findById(id);
        assertTrue(readTaskList.isPresent());

        //CleanUp
        taskListDao.deleteById(id);
    }


    @Test
    public void testTaskListDaoFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName1 = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName1);

        //Then
        Assert.assertEquals(0, readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);

    }
}