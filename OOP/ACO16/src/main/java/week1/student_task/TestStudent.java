package week1.student_task;

/**
 * Created by gorobec on 08.10.16.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new ContractStdent("Nick", "Smith", 5, 6);
        Student student2 = new ContractStdent("Jack", "Smith", 4, 3);
        Student student3 = new ContractStdent("John", "Smith", 3, 4);
        Student student4 = new ContractStdent("Kevin", "Smith", 4.5, 2);


        Student student5 = new BudgetStudent("David", "Smith", 5, 600);
        Student student6 = new BudgetStudent("Dan", "Smith", 4.3, 350);
        Student student7 = new BudgetStudent("Brandon", "Smith", 3.8, 400);
        Student student8 = new BudgetStudent("Jeremy", "Smith", 4.9, 250);


       Group group = new Group("ACO16", 4);
       Group group2 = new Group("ACB18", 4);



        University artCode = new University("ArtCode", 5);

        group.addStudent(student);
        group.addStudent(student3);
        group.addStudent(student5);
        group.addStudent(student7);



        group2.addStudent(student2);
        group2.addStudent(student4);
        group2.addStudent(student6);
        group2.addStudent(student8);

       /* artCode.addGroup(group);
        artCode.addGroup(group2);

        artCode.showGroups();
        artCode.showStudents();*/

       /* System.out.println(group);
        group.sort();
        System.out.println(group);
        group.sort(new AverageMarkComparator());
        System.out.println(group);*/

        System.out.println(group);

        student.setName("Johny");

        System.out.println(group);


    }
}
