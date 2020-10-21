public class LoanConsumer {



    int id;
    String firstName;
    String lastName;
    String workstream;

    public LoanConsumer(int id, String firstName, String lastName, String workstream) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.workstream = workstream;

    }

    public LoanConsumer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorkstream() {
        return workstream;
    }

    public void setWorkstream(String workstream) {
        this.workstream = workstream;
    }
}
