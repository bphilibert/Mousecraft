package main.java.fr.craft;

import java.util.LinkedList;

/**
 * Created by bphilibert on 2015/12/15.
 */
public class Protocol
{
    protected LinkedList<CraftStep> m_craftSteps;

    public Protocol ()
    {
        this.m_craftSteps = new LinkedList<>();
    }

    public Protocol (LinkedList<CraftStep> craftSteps)
    {
        this.m_craftSteps = craftSteps;
    }

}
