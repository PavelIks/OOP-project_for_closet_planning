package com.company;

public interface IBox
{
    boolean TakeItem(Box item);
    boolean PutItem(Box item);
    boolean CanPut(Box item);
    boolean CanTake(Box item);
    int MaxBoxesCount(Box item);
}