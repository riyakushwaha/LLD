package Patterns.Builder;

public class DELLBuilder implements DesktopBuilder {
    private Desktop desktop;

    public DELLBuilder() {
        this.desktop = new Desktop();
    }

    @Override
    public void buildCPU() {
        desktop.setCPU("AMD Ryzen 7");
    }

    @Override
    public void buildGPU() {
        desktop.setGPU("AMD Radeon RX 5700");
    }

    @Override
    public void buildRAM() {
        desktop.setRAM(32);
    }

    @Override
    public void buildStorage() {
        desktop.setStorage(2000);
    }

    @Override
    public void buildSSD() {
        desktop.setSSD(true);
    }

    @Override
    public void buildOS() {
        desktop.setOS("Ubuntu Linux");
    }

    @Override
    public void buildMSOffice() {
        // DELL desktops include MSOffice
        desktop.setMSOffice(true);
    }

    @Override
    public Desktop getDesktop() {
        return this.desktop;
    }
}
