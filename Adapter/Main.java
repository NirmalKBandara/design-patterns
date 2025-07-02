public class Main {
    public static void main(String[] args) {
        // We got a lightning cable
        LightningCable lightningCable = new LightningCable();
        // So we have to use lightning Charger
        // But we dont have a lightning Charger
        // There for we need to use an adapter
        // So we use USBC charger with a lightning cable
        USBCharger adapter1 = new LightningToUSBC(lightningCable);
        adapter1.charge();

        // Now we have a device which only can charge using a micro USB charger but we dont have such kind of charger.
        // So we have to use a adapter to do so...
        MicroUSBCable microUSBCable = new MicroUSBCable();
        USBCharger adapter2 = new MicroUSBToUSBC(microUSBCable);
        adapter2.charge();
    }
}