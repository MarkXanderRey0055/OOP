public class Person {
    protected String Name;
    protected String Address;

    //setters
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    //getters
    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String toString(){
        return "Hello I am " + Name + " and " + "I lived in " + Address + ".";
    } 


    
}