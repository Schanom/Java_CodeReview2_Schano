import java.util.ArrayList;

public class Exercise {
    String name;
    String description;
    int duration;
    String position;

    public Exercise(String name, String description, int duration, String position){
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
        exercises.add(this);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", position='" + position + '\'' +
                '}';
    }
    static ArrayList<Exercise> exercises = new ArrayList<>();

    public Exercise(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Exercise() {

    }

    public void printAll() {
        for (int i = 0; i < exercises.size(); i++) {
            System.out.println(exercises.get(i).name + "    Duration: " + exercises.get(i).duration + " seconds.");
            System.out.println("--------------------------------------------");
            System.out.println(exercises.get(i).description);
            System.out.println();
        }
    }

        public void printFloorEx() {
            for (int i = 0; i < exercises.size(); i++) {
                if (exercises.get(i).position == "Floor") {
                    System.out.println(exercises.get(i).name + "    Duration: " + exercises.get(i).duration + " seconds.");
                    System.out.println("-----------------------------------------------");
                    System.out.println(exercises.get(i).description);
                    System.out.println();
                }
            }
        }

            public void printFloorOverMinuteEx(){
                for (int i = 0; i < exercises.size(); i++){
                    if (exercises.get(i).position == "Floor" && exercises.get(i).duration > 60) {
                        System.out.println(exercises.get(i).name + "    Duration: " + exercises.get(i).duration + " seconds.");
                        System.out.println("-----------------------------------------------");
                        System.out.println(exercises.get(i).description);
                        System.out.println();
                    }
                }

    }
}
