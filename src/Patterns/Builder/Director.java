package Patterns.Builder;

public class Director {
    DesktopBuilder desktopBuilder;

    Director(DesktopBuilder desktopBuilder){
        this.desktopBuilder = desktopBuilder;
    }

    public void constructDesktop() {
        desktopBuilder.buildCPU();
        desktopBuilder.buildGPU();
        desktopBuilder.buildRAM();
        desktopBuilder.buildStorage();
        desktopBuilder.buildSSD();
        desktopBuilder.buildOS();
        desktopBuilder.buildMSOffice();
    }

    public void constructToyDesktop() {
        desktopBuilder.buildCPU();
    }

    public Desktop getDesktop() {
        return desktopBuilder.getDesktop();
    }

}
