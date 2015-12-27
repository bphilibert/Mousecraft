package main.java.fr.craft;

import java.util.ArrayList;

/**
 * Created by bphilibert on 2015/12/15.
 */
public class CraftStep
{
    protected ArrayList<Supply> m_supplies;

    public CraftStep()
    {
        this.m_supplies = new ArrayList<>();
    }

    public CraftStep(ArrayList<Supply> supplies)
    {
        this.m_supplies = supplies;
    }
}
