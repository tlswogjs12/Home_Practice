package Java;

/*
 틀
* */
public class User {

    private String name; // 이름
    private int age; // 나이
    private String hobby; // 취미

    //생성자는 클래스 이름과 일치해야 함

    // 클래스의 생성자


    //default 생성자를 생성
    public User(){

    }

    public User(String name, int age, String hobby){
        this.name = name;  //this는 클래스를 가리킴
        this.age = age;
        this.hobby = hobby;


        //생성자는 기본적으로 생성되어 있지만 보이지는 않음


    }

    //getter setter 영역
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }




}
