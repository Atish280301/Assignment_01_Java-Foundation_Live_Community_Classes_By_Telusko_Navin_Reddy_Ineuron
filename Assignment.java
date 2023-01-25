/*Q1. Pattern Printing : TELUSKO and INEURON*/
import java.lang.Math.*;
public class Assignment
{
public static void main(String args[])
{
	int height = 11;
	int width = 10;
System.out.println();
/*-------------------------------------------------------------------*/
	for(int i = 0; i < height; i++)
	{
		for(int j = 0; j < height; j++)
		{
			if(i == 0)
				System.out.print("*");
			else if(j == height / 2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("\n");
	}
System.out.println();
/*-------------------------------------------------------------------*/
	for(int i = 0; i < height; i++)
	{
		System.out.print("*");
		for(int j = 0; j < height; j++)
		{
			if((i == 0 || i == height - 1) || (i == height/2 && j <= height /2))
				System.out.print("*");
			else
				continue;
		}
		System.out.print("\n");
	}
System.out.println();
/*-------------------------------------------------------------------*/
	for(int i = 0; i < height; i++)
	{
		System.out.print("*");
		for(int j = 0; j <= height; j++)
		{
			if(i == height -1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("\n");
	}
System.out.println();
/*-------------------------------------------------------------------*/
 	for (int i = 0; i < height; i++)
    	{
       		if (i != 0 && i != height - 1)
            		System.out.printf("*");
       		else
            		System.out.printf(" ");
        		for (int j = 0; j < height; j++)
        		{
            		if (((i == height - 1) && j >= 0 && j < height - 1))
                			System.out.printf("*");
            		else if (j == height - 1 && i != 0 && i != height - 1)
               			System.out.printf("*");
            		else
               			System.out.printf(" ");
        		}
        		System.out.printf("\n");
    	}
System.out.println();
/*-------------------------------------------------------------------*/
	for (int i = 0; i < height; i++)
    	{
        		for (int j = 0; j < height; j++)
        		{
            		if ((i == 0 || i == height / 2 || i == height - 1))
                			System.out.printf("*");
            		else if (i < height / 2 && j == 0)
                			System.out.printf("*");
            		else if (i > height / 2 && j == height - 1)
                			System.out.printf("*");
            		else
                			System.out.printf(" ");
        		}
       		System.out.printf("\n");
    	}
System.out.println();
/*-------------------------------------------------------------------*/
int half = height / 2;
int dummy = half;
 for (int i = 0; i < height; i++)
    {
        System.out.printf("*");
        for (int j = 0; j <= half; j++)
        {
            if (j == Math.abs(dummy))
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
        dummy--;
    }
System.out.println();
/*-------------------------------------------------------------------*/
int space = height / 3;
width = height = height / 2 + height / 5 + space + space;
	for (int i = 0; i < height; i++)
    {
        for (int j = 0; j <= width; j++)
        {
            if (j == width - Math.abs(space) || j == Math.abs(space))
                System.out.printf("*");
            else if ((i == 0 || i == height - 1) && j > Math.abs(space) && j < width - Math.abs(space))
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        if (space != 0 && i < height / 2)
        {
            space--;
        }
        else if (i >= (height / 2 + height / 5))
            space--;
        System.out.printf("\n");
    }
System.out.println();
System.out.println();
/*-------------------------------------------------------------------*/
for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < height; j++)
        {
            if (i == 0 || i == height - 1)
                System.out.printf("*");
            else if (j == height / 2)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }
System.out.println();
/*-------------------------------------------------------------------*/
int counter = 0;
for (int i = 0; i < height; i++)
    {
        System.out.printf("*");
        for (int j = 0; j <= height; j++)
        {
            if (j == height)
                System.out.printf("*");
            else if (j == counter)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        counter++;
        System.out.printf("\n");
    }
System.out.println();
/*-------------------------------------------------------------------*/
	for(int i = 0; i < height; i++)
	{
		System.out.print("*");
		for(int j = 0; j < height; j++)
		{
			if((i == 0 || i == height - 1) || (i == height/2 && j <= height /2))
				System.out.print("*");
			else
				continue;
		}
		System.out.print("\n");
	}
System.out.println();
/*-------------------------------------------------------------------*/
	for (int i = 0; i < height; i++)
    	{
       		if (i != 0 && i != height - 1)
            		System.out.printf("*");
       		else
            		System.out.printf(" ");
        		for (int j = 0; j < height; j++)
        		{
            		if (((i == height - 1) && j >= 0 && j < height - 1))
                			System.out.printf("*");
            		else if (j == height - 1 && i != 0 && i != height - 1)
               			System.out.printf("*");
            		else
               			System.out.printf(" ");
        		}
        		System.out.printf("\n");
    	}
System.out.println();
/*-------------------------------------------------------------------*/
int half1 = height/2;
for (int i = 0; i < height; i++)
    {
        System.out.printf("*");
        for (int j = 0; j < width; j++)
        {
            if ((i == 0 || i == half) && j < (width - 2))
                System.out.printf("*");
            else if (j == (width - 2) && !(i == 0 || i == half1))
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }
System.out.println();
/*-------------------------------------------------------------------*/
space = height / 3;
width = height = height / 2 + height / 5 + space + space;
	for (int i = 0; i < height; i++)
    {
        for (int j = 0; j <= width; j++)
        {
            if (j == width - Math.abs(space) || j == Math.abs(space))
                System.out.printf("*");
            else if ((i == 0 || i == height - 1) && j > Math.abs(space) && j < width - Math.abs(space))
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        if (space != 0 && i < height / 2)
        {
            space--;
        }
        else if (i >= (height / 2 + height / 5))
            space--;
        System.out.printf("\n");
    }
System.out.println();
/*-------------------------------------------------------------------*/
int counter1 = 0;
for (int i = 0; i < height; i++)
    {
        System.out.printf("*");
        for (int j = 0; j <= height; j++)
        {
            if (j == height)
                System.out.printf("*");
            else if (j == counter1)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        counter1++;
        System.out.printf("\n");
    }
}
}