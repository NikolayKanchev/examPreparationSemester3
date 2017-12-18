package statePattern;

public class Winter implements Season
{
    @Override
    public void nextSeason(SeasonContext seasonContext)
    {
        System.out.println("Winter season is running....");

        seasonContext.setSeason(new SpringSeason());
    }
}
