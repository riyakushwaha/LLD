package Patterns.Builder;

public class HPBuilder implements DesktopBuilder {
    private Desktop desktop;

    public HPBuilder() {
        this.desktop = new Desktop();
    }

    @Override
    public void buildCPU() {
        desktop.setCPU("Intel i7");
    }

    @Override
    public void buildGPU() {
        desktop.setGPU("NVIDIA GTX 1660");
    }

    @Override
    public void buildRAM() {
        desktop.setRAM(16);
    }

    @Override
    public void buildStorage() {
        desktop.setStorage(1000);
    }

    @Override
    public void buildSSD() {
        desktop.setSSD(true);
    }

    @Override
    public void buildOS() {
        desktop.setOS("Windows 10");
    }

    @Override
    public void buildMSOffice() {
        // HP desktops do not include MSOffice
        desktop.setMSOffice(false);
    }

    @Override
    public Desktop getDesktop() {
        return this.desktop;
    }
}