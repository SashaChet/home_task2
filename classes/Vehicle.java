package classes;

public class Vehicle {

    private int rashod;
    private int sr_skorost;
    private Transport_sredstvo transport_sredstvo;

    public Vehicle(int rashod, int sr_skorost, String transport_sredstvo) {
        this.rashod = rashod;
        this.sr_skorost = sr_skorost;
        this.transport_sredstvo = Transport_sredstvo.valueOf(transport_sredstvo);
    }

    public void Time_r(double distanse, int sr_skorost) {
        double time_rashod;
        time_rashod = distanse / sr_skorost;
        System.out.println(time_rashod + " hour(s)");
    }

    public void Dezil_r(int rashod, double distanse) {
        double dezil;
        dezil = rashod * distanse;
        System.out.println(dezil + " liter(s)");
    }
}
