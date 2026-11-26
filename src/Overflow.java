public class Overflow {
    public static void main(String[] args) {

        byte number = 127;
        number = (byte) (number + 1);
        System.out.println(number);
    }
}
