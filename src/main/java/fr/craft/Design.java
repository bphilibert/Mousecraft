package main.java.fr.craft;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by bphilibert on 2015/12/14.
 */
public class Design
{
    protected String m_name;
    protected String m_description;
    protected LinkedList<ArrayList<Supply>> m_protocol;
    protected String m_shape;
    protected Item m_item;

    public Design ()
    {
        this.m_name = "No design";
        this.m_description = "No description for no design";
        this.m_protocol = new LinkedList<>();
        this.m_shape = "/tmp/no_img";
        this.m_item = null;
    }

    public Design (String name, String description, LinkedList<ArrayList<Supply>> protocol, Item item, String shape)
    {
        this.m_name = name;
        this.m_description = description;
        this.m_protocol = protocol;
        this.m_shape = shape;
        this.m_item = item;
    }

    public LinkedList<ArrayList<Supply>> getProtocol()
    {
        return m_protocol;
    }
}
