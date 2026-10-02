import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        String result = address.replace(".", "[.]");
        System.out.println(result);
    }
}
