package Assignments.Pizza;

public class PizzaStore
{
    public static void main(String[] args)
    {
        PizzaQueue q1 = new PizzaQueue();
        q1.deliver();
        q1.enqueue("Cheese", "123 Rhode Road");
        q1.enqueue("Pepperoni", "3 Sonoah Drive");
        q1.enqueue("Everything", "844 Colers Crossing");
        q1.deliver();
        q1.deliver();
        q1.deliver();
        q1.deliver();
    }
}
