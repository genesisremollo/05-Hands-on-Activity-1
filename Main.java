import java.util.Scanner;

class BloodBank {
    private String bloodType;
    private String rhFactor;

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BloodBank patient = new BloodBank();

        System.out.print("Enter blood type of patient: ");
        patient.setBloodType(scanner.nextLine());

        System.out.print("Enter the Rhesus factor (+ or -): ");
        patient.setRhFactor(scanner.nextLine());

        System.out.println(patient.getBloodType() + patient.getRhFactor() + " is added to the blood bank.");

        scanner.close();
    }
}

