package Collections.foodordermanagementsystem.comparatorinterfaces;

import java.util.*;

//Question: How do you handle primary and secondary sorting conditions? (The HackerRank Challenge)
//Scenario: Sort a list of Player objects primarily by their score in descending order. If two players have the identical score, sort them alphabetically by name.

public class PlayerScoreSorting {
    public static void main(String[] args) {
        Comparator<Player> com = new Comparator<Player>() {
            @Override
            public int compare(Player p1,Player p2)
            {
                if(p1.score < p2.score)
                {
                    return 1;
                }
                else if(p1.score > p2.score)
                {
                    return -1;
                }
                else {
                    return p1.name.compareTo(p2.name);
                }
            }
        };
        List<Player> l = new ArrayList<>();
        l.add(new Player("virat",98));
        l.add(new Player("ishan",86));
        l.add(new Player("shreyas",86));
        l.add(new Player("vaibhav",93));
        l.add(new Player("tilak",94));

        Collections.sort(l,com);

        Iterator<Player> it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
class Player
{
    String name;
    Integer score;

    Player(String name, Integer score)
    {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString()
    {
        return name + " " + score;
    }
}

