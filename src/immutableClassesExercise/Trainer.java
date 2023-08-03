package immutableClassesExercise;

import java.util.ArrayList;

public class Trainer {
	    private String name;
	    private ArrayList<String> streamsTaught;

	    public Trainer(String name) {
	        this.name = name;
	        this.streamsTaught = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Method to add a stream to streamsTaught ArrayList
	    public void addStream(String stream) {
	        streamsTaught.add(stream);
	    }

	    // Method to get all streams taught by the trainer
	    public ArrayList<String> getAllStreams() {
	        return new ArrayList<>(streamsTaught);
	    }
	}
	
