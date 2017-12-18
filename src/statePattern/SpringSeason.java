package statePattern;

public class SpringSeason implements Season
{
    @Override
    public void nextSeason(SeasonContext seasonContext)
    {
        System.out.println("Spring season is running.....");

        seasonContext.setSeason(new Summer());
    }
}
