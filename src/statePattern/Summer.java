package statePattern;

public class Summer implements Season
{
    @Override
    public void nextSeason(SeasonContext seasonContext)
    {
        System.out.println("Summer season is running.....");


        seasonContext.setSeason(new Autumn());
    }
}
