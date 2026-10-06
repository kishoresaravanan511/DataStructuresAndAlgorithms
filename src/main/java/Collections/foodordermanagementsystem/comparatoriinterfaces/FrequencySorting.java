package Collections.foodordermanagementsystem.comparatoriinterfaces;

import java.util.*;
public class FrequencySorting {
    public static void main(String[] args)
    {
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        List<Integer> l = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();

        for(int i : arr)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int x : arr)
        {
            l.add(x);
        }

        Comparator<Integer> com = new Comparator<>() {
            @Override
            public int compare(Integer i , Integer j)
            {
                Integer freq = Integer.compare(m.get(j),m.get(i)); //high frequency comes first.
                if(freq != 0)
                {
                    return freq;
                }
                else
                {
                    return Integer.compare(i,j);
                }

//  same approach , understandable way , but else is same for handle same frequency
//                if(freq > 0)
//                {
//                    return 1;
//                }
//                else if(freq < 0)
//                {
//                    return -1;
//                }
//                else {
//                    return Integer.compare(i,j);  //important , for handle same frequencies.
//                }
            }
        };

        Collections.sort(l,com);

        int[] ans = new int[l.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = l.get(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}
