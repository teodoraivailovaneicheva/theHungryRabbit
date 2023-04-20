import java.util.*;

public class Main {

    private static final Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "the rabbit came out of the garden"));
        locations.put(1, new Location(1, "Тhe rabbit is at the entrance to the garden "));
        locations.put(2, new Location(2, "Jump right"));
        locations.put(3, new Location(3, "Jump down"));
        locations.put(4, new Location(4, "Jump left"));


        System.out.println("The rabbit have to move right to enter in garden. Press 1.");//1 jump
        String direction = scanner.nextLine().toUpperCase();
        if (direction.equals("1")) {
            System.out.println("Congrats! He is in the garden. Press 2 and go down.");//1 jump
        } else {
            System.out.println("The possible direction is right.");
        }

        String direction1 = scanner.nextLine().toUpperCase();
        if (direction1.equals("2")) {
            System.out.println("The rabbit ate first carrots. To move on press 2 and go down.");//1 jump
        } else {
            System.out.println("The possible direction is down. There are no more carrots here.");
        }

        String direction2 = scanner.nextLine().toUpperCase();
        if (direction2.equals("2")) {
            System.out.println("The rabbit found an empty area. To move on press 2 and go down.");//1 jump
        } else {
            System.out.println("The possible direction is down. There are no more carrots here.");
        }

        String direction3 = scanner.nextLine().toUpperCase();
        System.out.println("The rabbit ate almost everything. He needs to jump only one time down, so press 2 and go down.");// 1 jump
        String direction4 = scanner.nextLine().toUpperCase();
        if (direction4.equals("2")) {
            System.out.println("The rabbit found the last carrots. To came out of the garden press 0.");//1 jump
        } else {
            System.out.println("The possible direction is right. There are no more carrots here.");
        }

        String direction5 = scanner.nextLine().toUpperCase();
        System.out.println("Congrats! He ate every carrot in the garden!");

        List<String> directions = Arrays.asList(direction, direction1, direction2, direction3, direction4, direction5);

        int count = 0;
        for (int i = 0; i < directions.size(); i++) {
            count++;
        }
        System.out.println("The rabbit jumped: " + count + " times.");
    }
}