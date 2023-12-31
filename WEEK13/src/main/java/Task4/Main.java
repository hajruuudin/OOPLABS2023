package Task4;

public class Main {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice newDevice = new NewDeviceImpl();
        NewDevice oldDeviceAdapter = new DeviceAdapter(oldDevice);

        System.out.println("Using NewDeviceImpl:");
        newDevice.operateNewFunction();

        System.out.println("Using DeviceAdapter with OldDeviceImpl:");
        oldDeviceAdapter.operateNewFunction();
    }
}
