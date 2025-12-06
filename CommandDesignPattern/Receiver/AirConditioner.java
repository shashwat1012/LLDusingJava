package CommandDesignPattern.Receiver;

public class AirConditioner {
    
    boolean isOn;
    int temp;
    public void turnOn() {
        isOn = true;
        System.out.println("AC has been turned on");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("AC has been turned off");
    }
    public void setTemp(int temp) {
        this.temp = temp;
        System.out.println("Temperature set to" + temp);
    }
    public int getTemp() {
        return temp;
    }
}
