public class MicroUSBToUSBC implements USBCharger {
    private MicroUSBCable microUSBCable;
    public MicroUSBToUSBC(MicroUSBCable microUSBCable) {
        this.microUSBCable = microUSBCable;
    }
    @Override
    public void charge() {
        microUSBCable.chargeWithMiceoUSB();
    }
}
