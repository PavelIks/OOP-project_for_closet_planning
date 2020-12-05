package com.company;

public class Box
{
    private double width;
    private double heigth;
    private double length;

    Box(double width,double heigth,double length)
    {
        this.heigth=heigth;
        this.width=width;
        this.length=length;
    }

    public void print()
    {
        System.out.println("Width: "+this.width+"\tHeight: "+this.heigth+"\tLength: "+length);
    }
    public void SetCombinations(int i)
    {
        switch (i)
        {
            case 1:
                {
                    this.width = this.width;
                    this.heigth = this.heigth;
                    this.length = this.length;
                }
                break;
            case 2:
                {
                    double tmp=this.length;
                    this.length=this.heigth;
                    this.heigth=tmp;
                }
                break;
            case 3:
                {
                    double tmp=this.heigth;
                    this.heigth=this.width;
                    this.width=tmp;
                }
                break;
            case 4:
                {
                    double tmp=this.length;
                    this.length=this.heigth;
                    this.heigth=tmp;
                }
                break;
            case 5:
                {
                    double tmp=this.width;
                    this.width=this.heigth;
                    this.heigth=tmp;
                }
                break;
            case 6:
                {
                    double tmp=this.length;
                    this.length=this.heigth;
                    this.heigth=tmp;
                }
                break;
        }
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
}