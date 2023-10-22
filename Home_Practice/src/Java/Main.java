package Java;

public class Main {
    public static void main(String[] args) {
        //메인함수
                          //3개 인자를 넣어줘야 하는데 안 넣어줬기 때문에 오류

        //생성자 파라미터(매개변수)에 맞게 인자를 삽입
        User user = new User(); // 클래스를 생성
        user.setName("James");
        user.setAge(30);
        user.setHobby("코딩하기");
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getHobby());



    }
}
