import java.time.LocalDate;
import java.util.Date;

public class Person {
    // PRIVATE VARIABLES
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;

    // CONSTRUCTORS:
    public Person(String firstname, String lastname, LocalDate dateOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

        // DEV:
    //public Person("Bob", "Marley", LocalDate.parse("1989-05-30"))

    // GETTERS:
    public String getFirstname(){ return firstname; }
    public String getLastname() { return lastname; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }

    // SETTERS:
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public void setDateOfBirth(LocalDate dateOfBirth) {this.dateOfBirth = dateOfBirth; }
}
