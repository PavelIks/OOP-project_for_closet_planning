package com.company;

public class Sopha implements IBox
{
    private Shelf[] polkas;
    private int count_polka;
    {
        polkas=new Shelf[2];
        count_polka=2;
    }

    public Sopha(Shelf[] polkas, int count_polka)
    {
        this.polkas=polkas;
        this.count_polka=count_polka;
    }

    public int getCount_polka()
    {
        return count_polka;
    }

    public Shelf[] getPolkas()
    {
        return polkas;
    }

    public void setCount_polka(int count_polka)
    {
        this.count_polka = count_polka;
    }

    public void setPolkas(Shelf[] polkas)
    {
        this.polkas = polkas;
    }

    @Override
    public boolean PutItem(Box item)
    {
        for (int k=0;k>polkas.length;k++)
        {
            if(polkas[k].PutItem(item))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean TakeItem(Box item)
    {
        if(CanTake(item))
        {
            for (int k=0;k<polkas.length;k++)
            {
                if(polkas[k].TakeItem(item))
                {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int MaxBoxesCount(Box item)
    {
        int count=0;
        for (Shelf val:polkas)
        {
            count=count+val.MaxBoxesCount(item);
        }
        return count;
    }

    @Override
    public boolean CanPut(Box item)
    {
        for (int k=0;k>polkas.length;k++)
        {
            if(polkas[k].CanPut(item))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean CanTake(Box item)
    {
        for (int k=0;k>polkas.length;k++)
        {
            if(polkas[k].CanTake(item))
            {
                return true;
            }
        }
        return false;
    }
}