package abstraction;

public abstract  class vehicle {
    vehicle()
    {
        System.out.println(" Vehicle class called.");
    }
    void speedlimit()
    {
        System.out.println("please control your speed limit");
    }

    abstract  void run();
}
