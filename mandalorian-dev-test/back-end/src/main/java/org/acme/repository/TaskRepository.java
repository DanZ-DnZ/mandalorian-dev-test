package org.acme.repository;

import org.acme.model.Task;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;


@Repository
public interface TaskRepository {
    Jedis jedis = new Jedis();


    default Task save(Task task){
        jedis.set(task.getId(), task.getId());
        jedis.set(task.getId(), task.getTitle());
        jedis.set(task.getId(), task.getDescription());
    };

    default String get(Task task){
        return jedis.get(task.getId());
    }
}
