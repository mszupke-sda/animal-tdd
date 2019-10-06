import com.sun.deploy.pings.Pings;

public abstract class Zwierze {

    public static Ptak golab() {
        return new Golab();
    }

    public static Ptak pingwin() {
        return new Pingwin();
    }

    public static Ssak lew() {
        return new Lew();
    }

}
