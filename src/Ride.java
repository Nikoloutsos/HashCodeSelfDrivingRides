public class Ride
{
    Point startIntersection;
    Point finishIntersection;
    int earliestStart;
    int latestStart;
    int ID;

    public Ride(Point startIntersection, Point finishIntersection, int earliestStart, int latestStart, int ID) {
        this.startIntersection = startIntersection;
        this.finishIntersection = finishIntersection;
        this.earliestStart = earliestStart;
        this.latestStart = latestStart;
        this.ID = ID;
    }

    public String toString()
    {
        return ("Starts from: "+startIntersection+" with destination: "+finishIntersection
                +". The earliest start is: "+earliestStart+". The latest start is: "+latestStart+"\n");
    }
}
