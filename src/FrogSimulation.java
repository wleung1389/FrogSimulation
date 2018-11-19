public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    private int numSimulations = 1;
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance()
    {
        return (int) Math.floor(Math.random() * (16)) - 5;
    }
    public boolean simulate()
    {
        int mHops = maxHops;
        System.out.print("Simulation " + numSimulations + " : ");
        int distance = 0;
        numSimulations++;
        for(int i = 0; i < mHops; i++) {
            int d = hopDistance();
            distance += d;
            System.out.print(" | " + d + " | ");
            if(distance < 0)
            {
                System.out.print("      Distance Reached | " + distance + " | ");
                System.out.println();
                return false;
            }
            if(distance >= goalDistance)
            {
                System.out.print("      Distance Reached | " + distance + " | ");
                System.out.println();
                return true;
            }
        }
        return false;
    }
    public double runSimulations(int num)
    {
        int trues = 0;
        for(int i = 0 ; i < num; i++)
        {
            boolean a = simulate();
            if(a)
            {
                trues++;
            }
        }
        return (double) trues/num;
    }

}
