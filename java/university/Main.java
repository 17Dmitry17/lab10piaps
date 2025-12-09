package university;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        University vsu = new University("VSU");

        Faculty fkn = new Faculty("FKN");
        vsu.addFaculty(fkn);

        Institute softEng = new Institute("Software Engineering", "Univ. sq. 1");
        fkn.addInstitute(softEng);

        Dean dean = new Dean(1, "Ivanov I.I.", "ivanov@vsu.ru");
        fkn.setDean(dean);

        Lecturer lecturer = new Lecturer(2, "Petrov P.P.", "petrov@vsu.ru", "Databases");
        lecturer.addInstitute(softEng);

        Course java = new Course("Java Programming", 101, 4.0f);
        lecturer.addCourse(java);

        Project ai = new Project("AI Research", new Date(), new Date());
        Participation p = new Participation(lecturer, ai, 120);

        System.out.println("=== University System ===");
        System.out.println("University: " + vsu.getName());
        System.out.println("Faculty: " + fkn.getName());
        System.out.println("Dean: " + dean.getName() + " (" + dean.getEmail() + ")");
        System.out.println("Institute: " + softEng.getName());
        System.out.println("Lecturer: " + lecturer.getName() + ", Field: " + lecturer.getFieldOfStudy());
        System.out.println("Course: " + java.getName() + " (ID: " + java.getId() + ")");
        System.out.println("Project: " + ai.getName());
        System.out.println("Participation hours: " + p.getHours());
    }
}
