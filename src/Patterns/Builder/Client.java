package Patterns.Builder;

public class Client {
    public static void main(String[] args) {
        DesktopBuilder hpBuilder = new HPBuilder();
        Director hpDirector = new Director(hpBuilder);

        hpDirector.constructDesktop();
        Desktop hpDesktop = hpDirector.getDesktop();
        System.out.println("HP Desktop: " + hpDesktop);

        DesktopBuilder dellBuilder = new DELLBuilder();
        Director dellDirector = new Director(dellBuilder);

        dellDirector.constructDesktop();
        Desktop dellDesktop = dellDirector.getDesktop();
        System.out.println("DELL Desktop: " + dellDesktop);



    }
}
