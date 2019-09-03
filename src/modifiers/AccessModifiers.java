package modifiers;

public class AccessModifiers {


    public int pincode;

    public AccessModifiers(int pincode, long phoneNumber, int atmPin, String houeNumber) {
        this.pincode = pincode;
        this.phoneNumber = phoneNumber;
        this.atmPin = atmPin;
        this.houeNumber = houeNumber;
    }

    protected long phoneNumber;
    protected  int atmPin;
    String houeNumber;



    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAtmPin() {
        return atmPin;
    }

    private void setAtmPin(int atmPin) {
        this.atmPin = atmPin;
    }

    public String getHoueNumber() {
        return houeNumber;
    }

    public void setHoueNumber(String houeNumber) {
        this.houeNumber = houeNumber;
    }

}
