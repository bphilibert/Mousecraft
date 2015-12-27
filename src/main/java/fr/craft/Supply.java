package main.java.fr.craft;

import java.util.ArrayList;

/**
 * Created by bphilibert on 2015/12/15.
 */
public class Supply
{
    protected String m_name;
    protected String m_description;
    protected ArrayList<Feature> m_features;

    public Supply()
    {
        this.m_name = "No supply";
        this.m_description = "No description for no supply";
        this.m_features = new ArrayList<>();
    }

    public Supply(String name, String description, ArrayList<Feature> features)
    {
        this.m_name = name;
        this.m_description = description;
        this.m_features = features;
    }
}
