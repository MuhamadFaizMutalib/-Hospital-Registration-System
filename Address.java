public class Address {
    private String street;
    private String city;
    private String postcode;
    private String state;

    public Address(String street, String city, String postcode, String state){
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.state = state;
    }

    public String getAddress(){
        return street + " " + city + " " + postcode + " " + state;
    }

    public void setAddress(){
        
    }


}
