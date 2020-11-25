import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    // Question 1
    System.out.println("How many rows would you like?");
    int rows1 = input.nextInt();
    System.out.println("How long would you like your rows?");
    int columns1 = input.nextInt();
    for (int i = 1; i <= rows1; i++)
    {
      for (int j = 1; j <= columns1; j++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }

    // Question 2
    System.out.println("How many rows would you like?");
    int rows2 = input.nextInt();
    for (int q = 1; q <= rows2; q++)
    {
      for (int w = 1; w <= q; w++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }

    // Question 3
    System.out.println("How many rows would you like?");
    int rows3 = input.nextInt();
    for (int a = 1; a <= rows3; a++)
    {
      for (int s = 1; s <= (rows3 - a); s++)
      {
        System.out.print(" ");
      }
      for (int d = 1; d <= a; d++)
      {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }

    // Question 4
    System.out.println("How many rows (top half) would you like?");
    int rows4 = input.nextInt();
    for (int z = 1; z <= rows4; z++)
    {
      for (int x = 1; x <= (rows4 - z); x++)
      {
        System.out.print(" ");
      }
      for (int c = 1; c <= z; c++)
      {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }
    for (int v = 1; v <= (rows4 - 1); v++)
    {
      for (int b = 1; b <= v; b++)
      {
        System.out.print(" ");
      }
      for (int n = rows4; n >= (v + 1); n--)
      {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }

    // Question 5
    System.out.println("How many rows would you like?");
    int rows5 = input.nextInt();
    for (int p = 1; p <= rows5; p++)
    {
      for (int u = 1; u <= (rows5 - p); u++)
      {
        System.out.print("o");
      }
      for (int y = 1; y <= p; y++)
      {
        System.out.print("T");
      }
      for (int y = 2; y <= p; y++)
      {
        System.out.print("T");
      }
      for (int u = 1; u <= (rows5 - p); u++)
      {
        System.out.print("o");
      }
      System.out.println("");
    }

    // Question 6
    System.out.println("How many rows would you like?");
    int rows6 = input.nextInt();
    for (int zz = 1; zz <= rows6; zz++)
    {
      for (int xx = 1; xx <= zz; xx++)
      {
        System.out.print((int)Math.pow(zz, 2) + " ");
      }
      System.out.println("");
    }

    // Question 7
    System.out.println("How many rows would you like?");
    int rows7 = input.nextInt();
    for (int aa = 1; aa <= rows7; aa++)
    {
      for (int ss = 0; ss < 10; ss++)
      {
        System.out.print(aa + ss + " ");
      }
      System.out.println("");
    }

    // Question 8
    System.out.println("What number would you like to start at?");
    int rows8 = input.nextInt() + 1;
    for (int qa = 1; qa <= (rows8); qa++)
    {
      for (int ws = 1; ws <= (rows8 - qa); ws++)
      {
        System.out.print(".");
      }
      System.out.print(rows8 - qa);
      System.out.println("");
    }
  }
}