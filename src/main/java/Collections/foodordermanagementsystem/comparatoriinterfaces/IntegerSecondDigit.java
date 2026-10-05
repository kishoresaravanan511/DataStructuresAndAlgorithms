package Collections.foodordermanagementsystem.comparatoriinterfaces;

import java.util.*;
public class IntegerSecondDigit
{
    public static void main(String[] args)
    {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer a,Integer b)
            {
                if(a%10 > b%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }

        };
        List<Integer> l = new ArrayList<>(Arrays.asList(18,21,97,63,86));

        Collections.sort(l,com);

        System.out.println(l);
    }
}
