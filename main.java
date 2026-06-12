public class Main {
    public static void main(String[] args) {
        
        Student std1 = new Student("Ali", "Rezaei", "1234567");
        Student std2 = new Student("Sara", "Ahmadi", "987654"); 
        
        std1.setGrade(18);
        
        
        Lab workshopLab = new Lab(2);
        workshopLab.enrollStudent(std1);
        workshopLab.enrollStudent(std2);
        
        System.out.println("\n--- Lab Information ---");
        workshopLab.printLabInfo();
    }
}
