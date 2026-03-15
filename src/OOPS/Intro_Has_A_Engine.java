package OOPS;

public class Intro_Has_A_Engine
{
     void Start()
    {
        System.out.println("Engine Started");
    }
}
class car
{
    Intro_Has_A_Engine A = new Intro_Has_A_Engine();

    void StartCar()
    {
        A.Start();
        System.out.println("Car Started");
    }

    static void main(String[] args)
    {
        car v = new car();
        v.StartCar();
    }
}

