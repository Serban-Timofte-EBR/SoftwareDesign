package lazy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Some commands to be executed");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Initialization when we need it
        Government government = Government.getInstance("UK Government", "Rt Hon Sir Keir Starmer", 143.139);
    }
}
