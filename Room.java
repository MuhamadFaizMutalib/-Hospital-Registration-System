import java.util.ArrayList;

public class Room {
    private String roomNo;
    private ArrayList<Patient> patients;

    public Room(String roomNo){
        this.roomNo = roomNo;

    }

    public void addPatient(Patient p){

    }

    public String getRoomNo(){return roomNo;}
    public void setRoomNo(String rN){}
}
