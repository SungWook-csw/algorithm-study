package GodOfJava;

// 1번,2번 문제
public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried; // (인스턴스 변수) 결혼 여부
// 3번 문제
    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        byte age = 27;
        String name = "Sung Wook";
        boolean isMarried = false;


        profile.setAge(age);
        profile.setName(name);
        profile.setMarried(isMarried);

        System.out.println(profile.getAge());
        System.out.println(profile.getName());
        System.out.println(profile.isMarried());
    }
    public void setAge(byte paramAge) {
        age=paramAge;
    }
    public byte getAge() {
        return age;
    }
    public void setName(String paramName) {
        name=paramName;
    }
    public String getName() {
        return name;
    }
    public void setMarried(boolean paramIsMarried) {
        isMarried=paramIsMarried;
    }

    public boolean isMarried() {
        return isMarried;
    }
}