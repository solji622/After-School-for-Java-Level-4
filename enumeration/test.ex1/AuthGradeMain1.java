package enumeration.test.ex1;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();

        for(AuthGrade grades : authGrades) {
            System.out.println("grade = " +grades.name() + ", level = " +
                    grades.getLevel() + ", description = " + grades.getDescription());
        }
    }
}
