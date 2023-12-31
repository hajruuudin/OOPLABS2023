package Task4;

public class DeviceAdapter implements NewDevice{
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }


    @Override
    public void operateNewFunction() {
        System.out.println("Adapting process");
        oldDevice.operateOldFunction();
    }
}
