package main.java.fr.craft;

/**
 * Created by bphilibert on 2015/12/14.
 */
public class Feature
{
    protected Features m_feature;
    protected int m_value;

    public Feature()
    {
        this.m_feature = null;
        this.m_value = 0;
    }

    public Feature(Features feature, int value)
    {
        this.m_feature = feature;
        this.m_value = value;
    }

    public Features getFeature()
    {
        return m_feature;
    }

    public void setFeature(Features feature)
    {
        this.m_feature = feature;
    }

    public int getValue()
    {
        return m_value;
    }

    public void setValue(int value)
    {
        this.m_value = value;
    }
}
