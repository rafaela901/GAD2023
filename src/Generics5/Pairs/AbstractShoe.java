package Generics5.Pairs;

public abstract class AbstractShoe implements  Shoe
{
    private int size;
    private String color;

    public AbstractShoe(int size, String color)
    {
        this.size = size;
        this.color = color;
    }

    @Override
    public String getColor()
    {
        return this.color;
    }

    @Override
    public int getSize()
    {
        return this.size;
    }
}