package GodOfJava;

public class ifAndOr {
    public static void main(String[] args) {
        ifAndOr scan = new ifAndOr();
        scan.ifAndor();
    }

    public void ifAndor() {
        int age = 25;
        boolean isMrried = true;

        if (age > 25 && isMrried) {
            System.out.println("Age is over 25 and Married");
        }
        if (age > 25 || isMrried) {
            System.out.println("Age is over 25 or Married");
        }
    }
}
