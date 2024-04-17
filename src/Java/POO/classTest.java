package Java.POO;

public class classTest {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i < num; i++) {
            int randomNumber = (int) (Math.random() * 10);
            System.out.println(randomNumber);
        }
    }
}
