package producerConsumerPattern;

/**
 * Created by Nikolaj on 15-09-2017.
 */
public class SharedData
{
    private int num;
    private volatile boolean availableForReading;

    public SharedData(int num)
    {
        this.num = num;
    }

    public synchronized int getNum()
    {
        while (!availableForReading)
        {
            try
            {
                wait();

            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        availableForReading = false;
        System.out.println(Thread.currentThread().getName() + "\t is reading.......\t" + this.num);
        notify();
        return this.num;
    }

    public synchronized void setNum(int num)
    {
        while (availableForReading)
        {
            try
            {
                wait();

            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        availableForReading = true;
        this.num += num;
        System.out.println(Thread.currentThread().getName() + "\t is producing.......\t" + this.num);
        notify();
    }
}
