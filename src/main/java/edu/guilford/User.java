package edu.guilford;

public class User {
    //attributes
    private String firstName;
    private String lastName;
    private String email;
    private String petName;

    //constructors
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        petName = "";
    }

    public User(String firstName, String lastName, String email, String petName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.petName = petName;
    }

    //getters and setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    //toString
    @Override
    public String toString() {
        return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", petName=" + petName
                + "]";
    }

    public String generatePassword(String favColor) { 
        //color, first name, last initial, pet name first 3 chars, email first 3 chars
        String password = favColor;
            password += firstName.charAt(0);
            password += lastName.charAt(0);
        if (petName.length() < 3) {
            password += petName;
        }
        else{
            password += petName.substring(0, 3);
        }
        if (email.length() < 3) {
            password += email;
        }
        else{
            password += email.substring(0, 3);
        }
        return password;
    }
    
    public String generatePassword2(String favFruit) {
        //alternating between first name and fruit
        String s1 = favFruit;
        String s2 = firstName;
        String password = "";
        int i = 0;
        while (i < s1.length() || i < s2.length()) {
            if (i < s1.length()) {
                password += s1.charAt(i);
            }
            if (i < s2.length()) {
                password += s2.charAt(i);
            }
            i++;
        }
        return password;
    }
}
