import java.util.Scanner;

interface Resume {
    void biodata();
}

class Teacher implements Resume {
    String name;
    String qualification;
    int experience;

    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

public class InterfaceResume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String qualification = sc.nextLine();
        int experience = sc.nextInt();

        Teacher teacher = new Teacher();
        teacher.name = name;
        teacher.qualification = qualification;
        teacher.experience = experience;

        teacher.biodata();

        sc.close();
    }
}
