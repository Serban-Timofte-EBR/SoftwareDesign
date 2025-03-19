package eager;

public class Main {
    public static void main(String[] args) {
        Government government = Government.getInstance();

        government.increaseBuget(3.4);
        government.announcement("Re-open the student finance loan for EU students");
    }
}