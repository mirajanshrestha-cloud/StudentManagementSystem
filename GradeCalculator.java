package StudentManagement;

public class GradeCalculator {

    public static double calculateAverage(int[] grades) {
        if (grades == null || grades.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92};
        double average = calculateAverage(grades);
        System.out.println("Average grade: " + average);
    }
}

