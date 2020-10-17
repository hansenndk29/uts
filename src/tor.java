import java.util.Scanner;

public class tor {
    String name, id;
    int amount;

    Scanner s = new Scanner(System.in);

    public String setName() {
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        this.name = name;
        return name;
    }

    public String setId() {
        System.out.println("Enter your ID");
        String id = s.nextLine();
        this.id = id;
        return id;
    }

}


