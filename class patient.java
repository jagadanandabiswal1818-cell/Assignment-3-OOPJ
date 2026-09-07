class Patient {
       private String patientName;
    private double height; // in meters
    private double width;  // patient's weight in kg
    public Patient(String patientName, double height, double width) {
        this.patientName = patientName;
        this.height = height;
        this.width = width;
    }

        public double computeBmi() {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        return width / (height * height);
    }

        public String getPatientName() {
        return patientName;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

public class Main {
    public static void main(String[] args) {
               Patient patient1 = new Patient("John Doe", 1.75, 70.0);

               double bmi = patient1.computeBmi();

                System.out.println("Patient Name: " + patient1.getPatientName());
        System.out.println("Height: " + patient1.getHeight() + " m");
        System.out.println("Weight: " + patient1.getWidth() + " kg");
        System.out.printf("Computed BMI: %.2f%n", bmi);
    }
}