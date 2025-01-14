package Patterns.Builder;

public class Desktop {
    private String CPU;
    private String GPU;
    private int RAM; // in GB
    private int storage; // in GB
    private boolean isSSD;
    private String OS;
    private boolean MSOffice; // New property

    // Getters and Setters
    public String getCPU() { return CPU; }
    public void setCPU(String CPU) { this.CPU = CPU; }

    public String getGPU() { return GPU; }
    public void setGPU(String GPU) { this.GPU = GPU; }

    public int getRAM() { return RAM; }
    public void setRAM(int RAM) { this.RAM = RAM; }

    public int getStorage() { return storage; }
    public void setStorage(int storage) { this.storage = storage; }

    public boolean isSSD() { return isSSD; }
    public void setSSD(boolean isSSD) { this.isSSD = isSSD; }

    public String getOS() { return OS; }
    public void setOS(String OS) { this.OS = OS; }

    public boolean hasMSOffice() { return MSOffice; }
    public void setMSOffice(boolean MSOffice) { this.MSOffice = MSOffice; }

    @Override
    public String toString() {
        return "Desktop [CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM +
                "GB, storage=" + storage + "GB, SSD=" + isSSD + ", OS=" + OS +
                ", MSOffice=" + MSOffice + "]";
    }
}

