package GodOfJava;

public class ProfileApp {
    String name = "OOO";
    int age = 0;

    public static void main(String[] args) {
        ProfileApp profile=new ProfileApp();
        profile.setName("Min");
        profile.setAge(20);
        profile.printName();
        profile.printAge();
    }

    public void setName(String str) {
        name = str;
    }
    public void setAge(int value) {
        age = value;
    }
    public void printName() {
        System.out.println("My name is " + name);
    }
    public void printAge() {
        System.out.println("My age is " + age);

    }
}