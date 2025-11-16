package NullObjectPattern;

public interface Vehicle {
    int getTankCapacity();
    int getSeatCapacity();
    //with upgraded versions of java, you can implement functions inside interfaces as well with the use of keywords like default,private and static
    default int getWheels(int wheels) {
        return wheels;
    }
}
