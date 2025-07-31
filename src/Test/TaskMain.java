package Test;

public class TaskMain {
    public static void main(String[] args) {
        
        AssignmentTask assignment = new AssignmentTask("Complete Project", 1, "2024-12-31");

       
        System.out.println(assignment.displayTaskInfo());
        System.out.println(assignment.completeTask());
        System.out.println(assignment.displayPriority());
    }
}

