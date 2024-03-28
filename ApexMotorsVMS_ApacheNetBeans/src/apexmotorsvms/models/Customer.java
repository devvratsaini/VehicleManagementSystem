package apexmotorsvms.models;

// customer is a person, thus inherits properties of Person Class
public class Customer extends Person {

    // data variables specific to a unique Customer
    private int customer_id;
    private int dealer_id;
    private char gender;
    private double annualIncome;

    // parameterized constructor
    public Customer(int customer_id, int dealer_id, char gender, double annualIncome) {
        this.customer_id = customer_id;
        this.dealer_id = dealer_id;
        this.gender = gender;
        this.annualIncome = annualIncome;
    }
    
    // getters and setters
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getDealer_id() {
        return dealer_id;
    }

    public void setDealer_id(int dealer_id) {
        this.dealer_id = dealer_id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    // functions specific to a unique Customer

}
