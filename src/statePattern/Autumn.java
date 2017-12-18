package statePattern;

public class Autumn implements Season
{
    @Override
    public void nextSeason(SeasonContext seasonContext)
    {
        System.out.println("Autumn season is running....");

        seasonContext.setSeason(new Winter());
    }
}
