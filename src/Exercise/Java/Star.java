package Exercise.Java;

public class Star {
    public static void main(String[] args) {

        // i = 1, 2, 3, 4, 5 번의 {} 내용을 반복
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
