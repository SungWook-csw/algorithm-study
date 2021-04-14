package GodOfJava;

public class ControlSwitch {
    public static void main(String[] args) {
        ControlSwitch scan = new ControlSwitch();
        scan.swichStatement(1);
        scan.swichStatement(2);
        scan.swichStatement(3);
        scan.swichStatement(4);
        scan.swichStatement(6);
    }
    public void swichStatement(int numberOfWheel){
        switch (numberOfWheel){
            case 1:
                System.out.println(numberOfWheel+":It is one foot bicycle.");
                break;
            case 2:
                System.out.println(numberOfWheel+":It is a motor cycle or bicycle.");
                break;
            case 3:
                System.out.println(numberOfWheel+"It is a three wheel car.");
                break;
            case 4:
                System.out.println(numberOfWheel+"It is a car.");
                break;
            default:
                System.out.println(numberOfWheel+"It is an expensive car.");
                break;
        }
    }
}
