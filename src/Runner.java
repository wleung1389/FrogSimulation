public class Runner {
    public static void main(String[] args)
    {
        FrogSimulation f = new FrogSimulation(20, 10);
        System.out.println("Success Proportion : " + f.runSimulations(10));
    }
}
