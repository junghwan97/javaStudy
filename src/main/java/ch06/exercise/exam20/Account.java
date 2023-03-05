package ch06.exercise.exam20;

public class Account {
        private String addressNum;
        private String addressPerson;
        private int balance;

     public Account(String addressNum, String addressPerson, int balance){
         this.addressNum = addressNum;
         this.addressPerson = addressPerson;
         this.balance = balance;
    }

    public String getAddressNum() {
        return addressNum;
    }

    public void setAddressNum(String addressNum) {
        this.addressNum = addressNum;
    }

    public String getAddressPerson() {
        return addressPerson;
    }

    public void setAddressPerson(String addressPerson) {
        this.addressPerson = addressPerson;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
