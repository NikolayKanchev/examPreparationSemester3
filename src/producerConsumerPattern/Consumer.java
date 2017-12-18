package producerConsumerPattern;

/**
 * Created by Nikolaj on 15-09-2017.
 */
public class Consumer extends Thread
{
    private SharedData data;

    public Consumer(SharedData data)
    {
        this.data = data;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 100 ; i++)
        {
            data.getNum();
        }
    }
}
