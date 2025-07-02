public class USBCCable implements USBCharger {
    @Override
    public void charge() {
        System.out.println("Device is charging by USBC Cable");
    }
}
