package learning.java.school;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Student[] students=new Student[]{
                new Student("claudio","2"),
                new Student("Alondra","3")
        };

        System.out.println("Los alumnos son:");
        Scanner scanner= new Scanner(System.in);


        for(int i=0; i < students.length; i++){
            System.out.println(students[i].getName()+"-"+students[i].getCode());


            System.out.print("Asistio?: ");
            String response= scanner.next("[YNyn]");

            System.out.println(students[i].getName()+ (response.equalsIgnoreCase("Y")? "Si":"No"));
        }

    }
}
