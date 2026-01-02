package com.linkedlist.circularlinkedlist.roundrobinscheduling;

public class RoundRobinScheduler {

	private Process head;
    private Process current;

    // method to add process at end
    public void addProcess(int processId, int burstTime, int priority) {
        Process newNode = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        current = head;
    }

    // method to remove process by ID
    public void removeProcess(int processId) {
        if (head == null) return;

        Process temp = head, prev = null;
        do {
            if (temp.processId == processId) {
                if (temp == head && head.next == head) {
                    // Only one process left
                    head = null;
                    current = null;
                } else if (temp == head) {
                    Process last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                if (temp == current) current = current.next;
                System.out.println("Process " + processId + " completed and removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }


    // method to display processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue!");
            return;
        }
        Process temp = head;
        System.out.println("Processes in Queue:");
        do {
            System.out.println("PID=" + temp.processId + ", Burst=" + temp.burstTime + ", Priority=" + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // method to simulate Round Robin Scheduling
    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule!");
            return;
        }

        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int completedProcesses = 0;
        int elapsedTime = 0;

        while (head != null) {
            Process temp = current;
            if (temp.burstTime > timeQuantum) {
                temp.burstTime -= timeQuantum;
                elapsedTime += timeQuantum;
                System.out.println("Process " + temp.processId + " executed for " + timeQuantum + " units. Remaining Burst=" + temp.burstTime);
                current = current.next;
            } else {
                elapsedTime += temp.burstTime;
                totalTurnaroundTime += elapsedTime;
                totalWaitingTime += (elapsedTime - temp.burstTime);
                System.out.println("Process " + temp.processId + " completed at time " + elapsedTime);
                int pid = temp.processId;
                current = current.next;
                removeProcess(pid);
                completedProcesses++;
                if (head == null) break;
            }
            displayProcesses();
        }

        double avgWT = (double) totalWaitingTime / completedProcesses;
        double avgTAT = (double) totalTurnaroundTime / completedProcesses;

        System.out.println("Average Waiting Time = " + avgWT);
        System.out.println("Average Turnaround Time = " + avgTAT);
    }

  
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Add processes
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.displayProcesses();

        // Simulate with time quantum = 3
        scheduler.simulate(3);
    }
}




