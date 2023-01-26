package Assignments.Pizza;

public class PizzaQueue {
    Pizza head, start;
    public class Pizza {
        String address;
        String toppings;
        Pizza next;

        Pizza(String toppings, String address){
            this.address = address;
            this.toppings = toppings;
        }
    }

    PizzaQueue()
    {
        head = null;
        start = null;
    }

    public void enqueue(String toppings, String address)
    {
        if (head == null)
        {
            head = new Pizza(toppings, address);
            start = head;
        }
        else
        {
            head.next = new Pizza(toppings, address);
            head = head.next;
        }
    }


    public void deliver()
    {
        if (head == null || start == null)
        {
            System.out.println("There are no Pizzas awaiting delivery!");
        }
        else
        {
            System.out.println("Delivering a " + start.toppings + " Pizza to " + start.address);
            start = start.next;
        }
    }
}
