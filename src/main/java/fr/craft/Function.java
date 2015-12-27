package main.java.fr.craft;

/**
 * Created by bphilibert on 2015/12/15.
 */
public class Function
{
    protected Features m_feature;
    protected int m_min;
    protected int m_max;

    public Function()
    {
        this.m_feature = null;
        this.m_min = 0;
        this.m_max = 5;
    }

    public Function(Features feature, int min, int max)
    {
        this.m_feature = feature;
        this.m_min = min;
        this.m_max = max;
    }
}
