package producerConsumerPattern;
/**
 * Created by Nikolaj on 15-09-2017.
 */
public class Main
{

    public static void main(String[] args)
    {
        SharedData data = new SharedData(100);
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        consumer.start();
        producer.start();
    }
}
