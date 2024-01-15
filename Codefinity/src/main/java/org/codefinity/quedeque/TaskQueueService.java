package org.codefinity.quedeque;

public interface TaskQueueService {
    void addTask(Task task);
    Task getNextTask();
    boolean isEmpty();
}
