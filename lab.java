public class Lab {
    private Student[] students;
    private int capacity;
    private int currentSize;

    public Lab(int capacity) {
        this.capacity = capacity;
        this.students = new Student[capacity];
        this.currentSize = 0;
    }

  
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full! Cannot enroll more students.");
        }
    }

  
    public void printLabInfo() {
        System.out.println("Lab Capacity: " + capacity + " | Enrolled: " + currentSize);
        for (int i = 0; i < currentSize; i++) {
            students[i].printStudentInfo();
        }
    }
}
