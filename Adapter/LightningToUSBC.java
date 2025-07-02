public class LightningToUSBC  implements USBCharger{
    private LightningCable lightningCable;

    public LightningToUSBC(LightningCable cable) {
        this.lightningCable = cable;
    }
    @Override
    public void charge() {
        lightningCable.chargeWithLightning();
    }
}
