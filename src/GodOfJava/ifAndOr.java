package GodOfJava;

public class ifAndOr {
    public static void main(String[] args) {
        ifAndOr scan = new ifAndOr();
        scan.tripleOrAnd();
    }

    /*    public void ifAndor() {
            int age = 25;
            boolean isMrried = true;

            if (age > 25 && isMrried) {
                System.out.println("Age is over 25 and Married");
            }
            if (age > 25 || isMrried) {
                System.out.println("Age is over 25 or Married");
            }
        }
    } */
    public void tripleOrAnd() {
        int age = 25;
        boolean isMarried = true;
        double height = 180;
        if ((age > 25 || isMarried) && height >= 180) {
            System.out.println("Age is over 25 or Married and height is over 180");
        }
        }
    }



