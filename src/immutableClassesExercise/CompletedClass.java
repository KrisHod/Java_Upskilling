package immutableClassesExercise;

import java.util.ArrayList;
import java.util.List;

public class CompletedClass {
	private final String subject;
    private final Trainer trainer;
    private final List<Trainee> trainees;

    public CompletedClass(String subject, Trainer trainer, List<Trainee> trainees) {
        this.subject = subject;
        this.trainer = new Trainer(trainer.getName()); // Clone the Trainer object to avoid direct reference
        this.trainees = new ArrayList<>(trainees); // Create a new ArrayList to avoid direct reference
    }
    
    public String getSubject() {
        return subject;
    }
    
 // Getter for trainer (return a cloned Trainer object)
    public Trainer getTrainer() {
        return new Trainer(trainer.getName());
    }
    
 // Getter for trainees (return a cloned ArrayList)
    public List<Trainee> getTrainees() {
        List<Trainee> clonedTrainees = new ArrayList<>();
        for (Trainee trainee : trainees) {
            clonedTrainees.add(new Trainee(trainee.getName(), trainee.getStream(), trainee.getWeek()));
        }
        return clonedTrainees;
    }
}
