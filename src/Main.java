import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key=new Scanner(System.in);
        Address address=new Address();
        System.out.println("enter email");
        String var=key.next();
        address.setEmail(var);
        System.out.println("enter phone");
        String var1=key.next();
        address.setPhone(var1);
        System.out.println(address.getEmail());

    }

}
