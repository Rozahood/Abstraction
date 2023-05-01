public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format(("%s %s%nsocial security number: %s" + getFirstName() + getLastName() + getSocialSecurityNumber()));
    }
    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation here

}
