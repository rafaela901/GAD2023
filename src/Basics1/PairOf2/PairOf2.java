package Basics1.PairOf2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PairOf2
{
    private ArrayList<Integer> arr;

    public void readArr()
    {
        Scanner in = new Scanner(System.in);
        arr = new ArrayList<>();

        System.out.print("Number of elements = ");
        int dim = in.nextInt();

        for(int i = 0; i < dim; ++i)
        {
            System.out.print("arr[" +  (i+1) + "] = ");
            arr.add(in.nextInt());
        }
    }

    public int countPairs()
    {
        Collections.sort(arr);

        int start = 0;
        int end = arr.size() - 1;
        int nrPairs = 0;

        while(start < end)
        {
            if(arr.get(start) + arr.get(end) == 0)
            {
                start ++;
                end--;
                nrPairs++;
            }
            else if(arr.get(start) + arr.get(end) < 0)
                start++;
            else
                end--;
        }

        return nrPairs;
    }

    public static void main(String[] Args)
    {
        PairOf2 ob = new PairOf2();
        ob.readArr();
        System.out.println("Number of pairs: " + ob.countPairs());
    }
}
