package main.java.fr.craft;

import java.util.ArrayList;

/**
 * Created by bphilibert on 2015/12/14.
 */
public class Material extends Supply
{
    protected int m_quantity;

    public Material()
    {
        super();
        this.m_quantity = 0;
    }

    public Material(String name, String description, ArrayList<Feature> features, int quantity)
    {
        super(name, description, features);
        this.m_quantity = quantity;
    }

}
