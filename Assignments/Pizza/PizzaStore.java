package Assignments.Pizza;

public class PizzaStore
{
    public static void main(String[] args)
    {
       oneStore();
       //twoStore();
    }

    public static void oneStore()
    {
        PizzaQueue myStore = new PizzaQueue();
        myStore.enqueue("pepperoni", "1234 Bobcat Trail");
        myStore.enqueue("sausage", "2345 University Drive");
        myStore.deliver();
        myStore.enqueue("extra cheese", "3456 Rickster Road");
        myStore.enqueue("everything", "4567 King Court");
        myStore.enqueue("coffee beans", "5678 Java Circle");
        myStore.deliver();
        myStore.deliver();
        myStore.deliver();
        myStore.deliver();
        myStore.deliver();
    }

    public static void twoStore()
    {
        PizzaQueue firstStore = new PizzaQueue();
        PizzaQueue secondStore = new PizzaQueue();
        firstStore.enqueue("111111", "111111111111111");
        secondStore.enqueue("AAAAAA", "AAAAAAAAAAAAAAA");
        firstStore.enqueue("222222", "222222222222222");
        secondStore.enqueue("BBBBBB", "BBBBBBBBBBBBBBB");
        firstStore.enqueue("333333", "333333333333333");
        secondStore.enqueue("CCCCCC", "CCCCCCCCCCCCCCC");
        firstStore.enqueue("444444", "444444444444444");
        secondStore.enqueue("DDDDDD", "DDDDDDDDDDDDDDD");
        firstStore.enqueue("555555", "555555555555555");
        secondStore.enqueue("EEEEEE", "EEEEEEEEEEEEEEE");
        firstStore.enqueue("666666", "666666666666666");
        secondStore.enqueue("FFFFFF", "FFFFFFFFFFFFFFF");

        firstStore.deliver();
        firstStore.deliver();
        firstStore.deliver();
        firstStore.deliver();
        firstStore.deliver();
        firstStore.deliver();
        firstStore.deliver();

        secondStore.deliver();
        secondStore.deliver();
        secondStore.deliver();
        secondStore.deliver();
        secondStore.deliver();
        secondStore.deliver();
        secondStore.deliver();
    }
}
