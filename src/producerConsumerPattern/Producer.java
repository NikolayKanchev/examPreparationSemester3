package producerConsumerPattern;

/**
 * Created by Nikolaj on 15-09-2017.
 */
public class Producer extends Thread
{
    public SharedData data;

    public Producer(SharedData data)
    {
        this.data = data;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            data.setNum(1);
        }
    }
}
