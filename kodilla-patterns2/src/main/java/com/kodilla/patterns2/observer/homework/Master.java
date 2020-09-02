package com.kodilla.patterns2.observer.homework;

public class Master implements HomeworkObserver {
    private final String username;
    private int updateCount;

    public Master(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(username + ": New task in queue " + taskQueue.getName() + "\n" +
                " (total: " + taskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
