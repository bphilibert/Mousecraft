package main.java.fr.craft;

import java.util.ArrayList;

/**
 * Created by bphilibert on 2015/12/14.
 */
public class Tool extends Supply
{
    protected ArrayList<Function> m_functions;

    public Tool()
    {
        super();
        this.m_functions = new ArrayList<>();
    }

    public Tool(String name, String description, ArrayList<Feature> features, ArrayList<Function> functions)
    {
        super(name, description, features);
        this.m_functions = functions;
    }
}
