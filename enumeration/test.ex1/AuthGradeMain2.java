package enumeration.test.ex1;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();

        for(AuthGrade grades : authGrades) {
            System.out.println("grade = " +grades.name() + ", level = " +
                    grades.getLevel() + ", description = " + grades.getDescription());
        }
    }
}
