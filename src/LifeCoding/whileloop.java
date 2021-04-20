package LifeCoding;

public class whileloop {
    public static void main(String[] args) {
        int i = 0;
        // i 의 값이 10 보다 작으면 true, 크다면 false 가 된다. 현재 i 의 값은 0 이기 때문에 실행 된다.
        while (i<10){
            System.out.println("Coding Everybody" + i);
            // i 의 값에 1을 더한다. 반복문의 중괄호 마지막 라인에 도달하면 반복문은 반복문을 재호출한다. 이때 i<10의 값을 검사하게 된다.
            i++;

        }
    }
}
