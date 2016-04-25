package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

        QueryBuilder builder = new QueryBuilder();

        Matcher m1 = builder.playsIn("EDM")
                .hasAtLeast(10, "goals")
                .hasFewerThan(15, "assists").build();

        QueryBuilder builder2 = new QueryBuilder();

        Matcher m2 = builder2.playsIn("ANA")
                .hasAtLeast(40, "points").build();

        Matcher m = builder.oneOf(m1, m2).build();


        
        
        
//        QueryBuilder builder2 = new QueryBuilder();
//
//        Matcher m2 = builder2.playsIn("ANA")
//                .hasAtLeast(40, "points").build();
//        
//        Matcher m1 = builder.playsIn("EDM")
//                .hasAtLeast(10, "goals")
//                .hasFewerThan(15, "assists").not(m2).build();


        
        
        for (Player player : stats.matches(m1)) {
            System.out.println(player);
        }

    }

}
