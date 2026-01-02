package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskScheduler {
	
	private Task head;
    private Task current;

    // method to add task at beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newNode = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
        current = head;
    }


    // method to add task at end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newNode = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        current = head;
    }

    // method to add task at specific position 
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        Task newNode = new Task(taskId, taskName, priority, dueDate);
        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // method to remove task by ID
    public void removeById(int taskId) {
        if (head == null) {
            System.out.println("No tasks in the scheduler!");
            return;
        }
        Task temp = head, prev = null;
        do {
            if (temp.taskId == taskId) {
                if (temp == head) {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task not found!");
    }

    // method to view current task
    public void viewCurrentTask() {
        if (current != null) {
            System.out.println("Current Task: ID=" + current.taskId + ", Name=" + current.taskName +
                    ", Priority=" + current.priority + ", DueDate=" + current.dueDate);
        } else {
            System.out.println("No current task!");
        }
    }

    // method to move to next task
    public void moveToNextTask() {
        if (current != null) {
            current = current.next;
            viewCurrentTask();
        } else {
            System.out.println("No tasks available!");
        }
    }

    // method to display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks in the scheduler!");
            return;
        }
        Task temp = head;
        System.out.println("Tasks in Scheduler:");
        do {
            System.out.println("ID=" + temp.taskId + ", Name=" + temp.taskName +
                    ", Priority=" + temp.priority + ", DueDate=" + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // method to search by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks in the scheduler!");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Found Task: ID=" + temp.taskId + ", Name=" + temp.taskName +
                        ", Priority=" + temp.priority + ", DueDate=" + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No tasks found with Priority " + priority);
    }


	public static void main(String[] args) {


		TaskScheduler scheduler = new TaskScheduler();

        // Add tasks
        scheduler.addAtBeginning(1, "Design Module", 2, "2026-01-05");
        scheduler.addAtEnd(2, "Code Review", 1, "2026-01-06");
        scheduler.addAtPosition(2, 3, "Testing", 3, "2026-01-07");

        // Display tasks
        scheduler.displayTasks();

        // View current task
        scheduler.viewCurrentTask();

        // Move to next task
        scheduler.moveToNextTask();
        scheduler.moveToNextTask();

        // Search by priority
        scheduler.searchByPriority(1);

        // Remove task
        scheduler.removeById(3);
        scheduler.displayTasks();


	}

}
