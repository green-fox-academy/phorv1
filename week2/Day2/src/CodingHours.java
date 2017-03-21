public class CodingHours {
    public static void main(String[] args) {
        int studentDaily = 6;
        int semesterLenghts = 17;
        int workDays = 5;
        int avgWorkHours = 52;
        float totalCoded = (studentDaily * semesterLenghts * workDays);
        float totalHours = (avgWorkHours * semesterLenghts);
        float percentage = (totalCoded / totalHours) * 100;
        System.out.println("Hours spent with coding by the attendee: " + totalCoded);
        System.out.println("Percentage of coded hours: " + percentage + "%");
    }
}