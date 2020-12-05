package com.company;

public class Shelf implements IBox
{
    private double width;
    private double heigth;
    private double length;
    private Box[] items;
    {
        width=100;
        heigth=100;
        length=100;
        items=new Box[1];
    }

    Shelf(double width,double heigth,double length)
    {
        this.heigth=heigth;
        this.width=width;
        this.length=length;
    }

    Shelf(double width,double heigth,double length,Box[] items)
    {
        this.heigth=heigth;
        this.width=width;
        this.length=length;
        this.items=items;
    }

    public Box[] getItems()
    {
        return items;
    }

    public void setItems(Box[] items)
    {
        this.items = items;
    }

    public void setHeigth(double heigth)
    {
        this.heigth = heigth;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeigth()
    {
        return heigth;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    @Override
    public boolean TakeItem(Box item)
    {
        for (int k=0;k<items.length;k++)
        {
            if(item==items[k])
            {
                items[k]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean PutItem(Box item)
    {
        if(CanPut(item)==false)
        {
            return false;
        }
        Box[] tmpites=new Box[items.length+1];
        for(int j=0;j<items.length;j++)
        {
            tmpites[j]=items[j];
        }
        tmpites[tmpites.length-1]=item;
        return true;
    }

    @Override
    public boolean CanTake(Box item)
    {
        for (int k=0;k<items.length;k++)
        {
            if(items[k]==item)
            {
                return true;
            }
        }
        return false;
    }

    public boolean CanPutOne(Box item)
    {
        if
        (
                this.width>=item.getWidth() &&
                this.heigth>=item.getHeigth() &&
                this.length>=item.getLength()
        )
        {
            return true;
        }
        return false;
    }

    public int MaxBoxesCount(Box item)
    {
        int count=(int)(this.width/item.getWidth())*(int)(this.heigth/item.getHeigth())*(int)(this.length/item.getLength());
        return count;
    }

    public void TryVpihnut(Box item)
    {
        int combination=1;
        while(!CanPutOne(item) && combination<=6)
        {
            item.SetCombinations(combination);
            combination++;
            item.print();
        }
    }

    @Override
    public boolean CanPut(Box item)
    {
        return false;
    }
}