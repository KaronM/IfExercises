public class Main {
    public static void main(String[] args) {
        StudentReportCard reportCard = new StudentReportCard("John Doe", "12345", 85, 90, 75, 80);
        System.out.println("Student Name: " + reportCard.getStudentName());
        System.out.println("Student ID: " + reportCard.getStudentID());
        System.out.println("Average Grade: " + reportCard.calculateAverage());
        System.out.println("Overall Grade: " + reportCard.determineGrade());
    }
}
