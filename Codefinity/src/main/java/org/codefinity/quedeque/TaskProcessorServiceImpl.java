package org.codefinity.quedeque;

public class TaskProcessorServiceImpl implements TaskProcessorService {
    TaskQueueService mTaskQueueService;

    public TaskProcessorServiceImpl(TaskQueueService taskQueueServiceImpl) {
        this.mTaskQueueService = taskQueueServiceImpl;
    }

    @Override
    public void processTasks() {
        while(!mTaskQueueService.isEmpty()) {
            Task mTask = mTaskQueueService.getNextTask();
            System.out.println("Processing Task: " + mTask);
        }
        System.out.println("All tasks processed.");
    }
}
