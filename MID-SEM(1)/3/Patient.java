public class Patient {

    String name;
    int age;
    String ward;
    String HealthNotes;

    static int counter = 1000;   // for auto ID generation
    int ID;                      // individual patient ID

    // 1️⃣ Emergency Patient
    Patient() {
        ID = ++counter;
        this.name = "Unknown";
        this.age = 0;
        this.ward = "Emergency";
        this.HealthNotes = "Not Issued";
    }

    // 2️⃣ OPD Patient
    Patient(String name, int age, String ward) {
        ID = ++counter;
        this.name = name;
        this.age = age;
        this.ward = ward;
        this.HealthNotes = "Not Issued";
    }

    // 3️⃣ Camp Registration
    Patient(String name, String HealthNotes, int age) {
        ID = ++counter;
        this.name = name;
        this.age = age;
        this.HealthNotes = HealthNotes;
        this.ward = "Health Camp";
    }

    // 4️⃣ Camp → Hospital Admission (Copy Constructor)
    Patient(Patient camp, String ward) {
        ID = ++counter;
        this.name = camp.name;
        this.age = camp.age;
        this.HealthNotes = camp.HealthNotes;
        this.ward = ward;
    }

    void details() {
        System.out.println("Patient ID: " + ID);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Patient Ward: " + ward);
        System.out.println("Patient Health-Notes: " + HealthNotes);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {

        Patient patient1 = new Patient();
        Patient patient2 = new Patient("Ramu", 33, "OPD");
        Patient patient3 = new Patient("Anjali", "High-Bp", 24);
        Patient patient4 = new Patient(patient3, "General");

        patient1.details();
        patient2.details();
        patient3.details();
        patient4.details();
    }
}