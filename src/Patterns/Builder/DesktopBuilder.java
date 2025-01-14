package Patterns.Builder;

public interface DesktopBuilder {
    void buildCPU();
    void buildGPU();
    void buildRAM();
    void buildStorage();
    void buildSSD();
    void buildOS();
    void buildMSOffice(); // New method
    Desktop getDesktop();
}

