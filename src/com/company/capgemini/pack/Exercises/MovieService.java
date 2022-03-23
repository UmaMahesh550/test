package com.company.capgemini.pack.Exercises;

import java.time.LocalDate;
import java.util.*;

public class MovieService {
    static Integer rating;
    static TreeMap<Movie, Integer> movieMap= new TreeMap<Movie, Integer>();
    LocalDate a = LocalDate.of(2012, 6, 30);
    static void addKeyValuePairsToMap(Movie movie, Integer rating)
    {
        LocalDate a = LocalDate.of(2022, 3, 30);
        LocalDate b = LocalDate.of(2012, 7, 10);
        LocalDate c = LocalDate.of(2021, 9, 19);
        LocalDate d = LocalDate.of(2010, 2, 15);
        movieMap.put(new Movie(6555,"Radhe","Love",a),8);
        movieMap.put(new Movie(2089,"RRR","Adventure", b),6);
        movieMap.put(new Movie(9863, "AVP", "Family-Drama", c),7);
        movieMap.put(new Movie(1763, "SVP", "Action-Thriller", d),5);
        System.out.println("================= Key Value Pairs added to Map ===================");
        movieMap.forEach((k,v)-> System.out.println(k +" | Rating : "+v));
    }
    static void getHigherRatedMovieNames()
    {
        List<Movie> li = new ArrayList<Movie>();
        LocalDate a = LocalDate.of(2022, 3, 30);
        LocalDate b = LocalDate.of(2012, 7, 10);
        LocalDate c = LocalDate.of(2021, 9, 19);
        LocalDate d = LocalDate.of(2010, 2, 15);
        li.add(new Movie(2343,"RRR","Adventure",a,8));
        li.add(new Movie(3424,"AVP","Family-Drama",b,6));
        li.add(new Movie(4355,"SVP","Action-Thriller",c,10));
        li.add(new Movie(2343,"FIR","Adventure",d,9));
////        List<Movie> sorted=new ArrayList<>();
////        Collections.sort(sorted);
//        Collections.max(li);
        Collections.sort(li,new RatingComparator());
        Iterator<Movie> it = li.iterator();
        System.out.println("Movies with Higher Rating : \n");
        System.out.println(li.get(3)+"\n"+li.get(2));

    }
    static void getMovieNamesOfSpecificGenre()
    {
        String gen="Adventure";
        List<Movie> li = new ArrayList<Movie>();
        LocalDate a = LocalDate.of(2022, 3, 30);
        LocalDate b = LocalDate.of(2012, 7, 10);
        LocalDate c = LocalDate.of(2021, 9, 19);
        LocalDate d = LocalDate.of(2010, 2, 15);
        li.add(new Movie(2343,"RRR","Adventure",a));
        li.add(new Movie(3424,"AVP","Family-Drama",b));
        li.add(new Movie(4355,"SVP","Action-Thriller",c));
        li.add(new Movie(2343,"FIR","Adventure",d));
        for(Movie m:li)
        {
            if(m.getGenre().equals(gen))
            {
                System.out.println("MovieName : "+m.getMovieName()+"\nMovieGenre : "+m.getGenre());
            }
        }
    }
    static void getMovieReleasedAfterSpecificDateAndRatingLesserThanThree()
    {
        Integer rat=7;
        List<Movie> li = new ArrayList<Movie>();
        LocalDate a = LocalDate.of(2022, 3, 30);
        LocalDate b = LocalDate.of(2012, 7, 10);
        LocalDate c = LocalDate.of(2021, 9, 19);
        LocalDate d = LocalDate.of(2010, 2, 15);
        li.add(new Movie(2343,"RRR","Adventure",a,10));
        li.add(new Movie(3424,"AVP","Family-Drama",b,6));
        li.add(new Movie(4355,"SVP","Action-Thriller",c,6));
        li.add(new Movie(2343,"FIR","Adventure",d,9));
        LocalDate key = LocalDate.of(2014, 2, 15);
        for(Movie m1:li) {
            if (m1.releaseDate.isAfter(key) & m1.rating >= rat) {
                System.out.println("MovieName : "+m1.getMovieName()+"\nMovie ReleaseDate : "+m1.getReleaseDate()+"\nMovieRating : "+m1.getRating());
            }
        }
    }
    static List<Movie> getSortedMovieListByReleaseDate()
    {
        List<Movie> li = new ArrayList<Movie>();
        LocalDate a = LocalDate.of(2022, 3, 30);
        LocalDate b = LocalDate.of(2012, 7, 10);
        LocalDate c = LocalDate.of(2021, 9, 19);
        LocalDate d = LocalDate.of(2010, 2, 15);
        li.add(new Movie(2343,"RRR","Adventure",a,10));
        li.add(new Movie(3424,"AVP","Family-Drama",b,8));
        li.add(new Movie(4355,"SVP","Action-Thriller",c,6));
        li.add(new Movie(2343,"FIR","Adventure",d,8));
        Collections.sort(li);
        return li;
    }
    static List<Movie> getSortedMovieListByRating()
    {
        List<Movie> li = new ArrayList<Movie>();
        LocalDate a = LocalDate.of(2022, 3, 30);
        LocalDate b = LocalDate.of(2012, 7, 10);
        LocalDate c = LocalDate.of(2021, 9, 19);
        LocalDate d = LocalDate.of(2010, 2, 15);
        li.add(new Movie(2343,"RRR","Adventure",a,10));
        li.add(new Movie(3424,"AVP","Family-Drama",b,4));
        li.add(new Movie(4355,"SVP","Action-Thriller",c,7));
        li.add(new Movie(2343,"FIR","Adventure",d,5));

        Collections.sort(li,new RatingComparator());
        return li;
    }

    public static void main(String[] args) {
        addKeyValuePairsToMap(new Movie(),rating);
        System.out.println("======================= Higher Rated Movies =====================");
        getHigherRatedMovieNames();
        System.out.println("===================== Movies of Specific Genre ==================");
        getMovieNamesOfSpecificGenre();
        System.out.println("============== Movies after specific date and rating ============");
        getMovieReleasedAfterSpecificDateAndRatingLesserThanThree();
        System.out.println("======================= Sort on Release Date ====================");
        List<Movie> res4=getSortedMovieListByReleaseDate();
        for(Movie m1:res4)
        {
            System.out.println(m1+" | Rating - "+m1.rating);
        }
        System.out.println("=========================== Sort on Rating ======================");
        List<Movie> res5=getSortedMovieListByRating();
        for (Movie m2:res5)
            System.out.println(m2+" | Rating - "+m2.rating);

    }
}
