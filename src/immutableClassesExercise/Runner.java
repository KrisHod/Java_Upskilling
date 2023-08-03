package immutableClassesExercise;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Trainee trainee1 = new Trainee("John", "Java", 1);
        Trainee trainee2 = new Trainee("Alice", "Python", 2);
        Trainee trainee3 = new Trainee("Bob", "JavaScript", 3);

        List<Trainee> traineesList = new ArrayList<>();
        traineesList.add(trainee1);
        traineesList.add(trainee2);
        traineesList.add(trainee3);
        
        Trainer trainer = new Trainer("Mike");
        
        trainer.addStream("Java");
        trainer.addStream("Python");
        trainer.addStream("JavaScript");
        
        CompletedClass completedClass = new CompletedClass("Full Stack Development", trainer, traineesList);
        
        //Change the value of the week attribute for each Trainee object
        trainee1.setWeek(5);
        trainee2.setWeek(6);
        trainee3.setWeek(7);
        
        //Call the getTrainees() method and verify that the week attribute is not changed
        List<Trainee> traineesInCompletedClass = completedClass.getTrainees();
        for (Trainee trainee : traineesInCompletedClass) {
            System.out.println("Trainee Name: " + trainee.getName() + ", Week: " + trainee.getWeek());
        }
        
        //Call the Trainer's addStream() method and add a new stream
        trainer.addStream("C#");
        
        //Call the getTrainer() method and verify that it still contains only 3 streams
        Trainer trainerInCompletedClass = completedClass.getTrainer();
        List<String> streamsTaught = trainerInCompletedClass.getAllStreams();
        System.out.println("Number of Streams Taught by Trainer: " + streamsTaught.size());
	}

}
