import java.util.ArrayList;
import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {

//Arrays
//        String[] trainers = {"Anna", "Thibyaa", "Colin", "Zsolt"};
//        index numbers: first value will always be 0 and it follows 1 and so on.
//        System.out.println(trainers[2]);
//
//        String[] emptyTrainers = new String[4];
//        emptyTrainers[0] = "Anna";
//        emptyTrainers[1] = "Thibyaa";
//        emptyTrainers[2] = "Colin";
//        emptyTrainers[3] = "Zsolt";
//        System.out.println(emptyTrainers[2]);

//Array Lists
//        ArrayList<String> trainers = new ArrayList<>();
//
//        ArrayList<String> trainers2 = new ArrayList<>();
//
//        trainers.add("Anna");
//        trainers.add("Thibyaa");
//        trainers.add("Colin");
//        trainers.add("Zsolt");
//
//        trainers2.add("Rich");
//        trainers2.add("Phil");
//
//        trainers.addAll(trainers2);
//        System.out.println(trainers.size());
//
//        System.out.println(trainers.get(5));


// Maps
        HashMap<String, Integer> mathsTestResults = new HashMap<>();

        mathsTestResults.put("Colin", 100);
        mathsTestResults.put("Anna", 98);
        mathsTestResults.put("Thibyaa", 99);
        mathsTestResults.put("Zsolt", 21);

        System.out.println(mathsTestResults.values());


    }
}
