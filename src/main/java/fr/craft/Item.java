package main.java.fr.craft;

/**
 * Created by bphilibert on 2015/12/15.
 */
public class Item
{
    protected String m_name;
    protected String m_description;

    public Item ()
    {
        this.m_name = "No item";
        this.m_description = "No desc for no item";
    }

    public Item (String name, String description)
    {
        this.m_name = name;
        this.m_description = description;
    }
}
