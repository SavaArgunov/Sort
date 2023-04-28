public class Computer {
    int cost;
    int CPUserie;
    int GPUserie;

    Computer(int c, int CPU, int GPU) {
        this.cost = c;
        this.CPUserie = CPU;
        this.GPUserie = GPU;
    }
    int getCost()
    {
        return cost;
    }
    int getCPUserie()
    {
        return CPUserie;
    }
    int getGPUserie()
    {
        return GPUserie;
    }
}
