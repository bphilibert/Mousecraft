package main.java.fr.craft;

import java.util.ArrayList;

/**
 * Created by bphilibert on 2015/12/15.
 */
public class Crafting
{
    protected Design m_design;
    protected ArrayList<Supply> m_supplies;
    protected int m_step;

    public Crafting ()
    {
        this.m_design = null;
        this.m_supplies = new ArrayList<>();
        this.m_step = 0;
    }

    public void add(Design design)
    {
        this.m_design = design;
    }

    public void add(Supply supply)
    {
        if (m_design != null)
        {
            if (m_design.getProtocol().get(m_step).contains(supply))
            {
                if (m_design.getProtocol().get(m_step).)
                {
                    m_supplies.add(supply);
                    m_step++;
                }
            }
        }
    }

    public void validate()
    {
        null;
    }
}
