public class Person {
    private String name;
    private String gender;
    private String IC;
    private Address address;

    public Person(){}
    public Person(String name, String gender, String IC, Address address){
        this.name = name;
        this.gender = gender;
        this.IC = IC;
        this.address = address;
    }

    public String getName(){return name;}
    public String getGender(){return gender;}
    public String getIC(){return IC;}
    public Address getAddress(){return address;}

    public void setName(String name){}
    public void setGender(String gender){}
    public void setIC(String IC){}
    public void setAddress(Address address){}

    public String registration(String registration){

    }
}

class Doctor extends Person{
    private String docID;

    public Doctor(String name, String gender, String IC, String docID){
        super(name, gender, IC, null);
        this.docID = docID;
    }

    public String getDocID(){return docID;}
    public void setDocID(String docID){}
}

class Patient extends Person{
    private String patientID;
    private Appointment p_appointment;

    public Patient(String name, String gender, String IC, Address address, String pID){
        super(name, gender, IC, address);
        patientID = pID;
    }

    public String getPatientID(){return patientID;}
    public void setPatientID(String pID){}

    public String registration(String registration){

    }
}

class Admin extends Person{
    private String adminID;
    private Appointment a_appointment;
    private Hospital hospital;

    public Admin(String adminID){
        this.adminID = adminID;
    }

    public String getAdminID(){return adminID;}
    public void setAdminID(String aID){}

    public void registerPatient(Patient p){

    }

    public String registration(String r){

    }

    public void updateAppointment(){

    }
}
