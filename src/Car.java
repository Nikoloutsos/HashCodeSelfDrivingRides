import java.util.ArrayList;
import java.util.List;

public class Car
{
    public Point position;
    public int steps;
    public List<Ride> rides;
    public List<Integer> rideIndexes;

    public Car(){
        this.position = new Point();
        this.steps = 0;
        rides = new ArrayList<>();
    }


    public void addRide(Ride ride){
        rides.add(ride);
        steps += main.calculateDinstance(ride) + main.calculateProximity(this, ride);
        position = ride.finishIntersection;

    }


}
