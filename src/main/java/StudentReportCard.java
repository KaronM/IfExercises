public class StudentReportCard {
    private String studentName;
    private String studentID;
    private int mathematicsGrade;
    private int englishGrade;
    private int scienceGrade;
    private int historyGrade;

    public StudentReportCard(String studentName, String studentID, int mathematicsGrade, int englishGrade, int scienceGrade, int historyGrade) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.mathematicsGrade = mathematicsGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        this.historyGrade = historyGrade;
    }

    public double calculateAverage() {
        return 0;
    }

    public String determineGrade() {
        return null;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getMathematicsGrade() {
        return mathematicsGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getScienceGrade() {
        return scienceGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }
}
