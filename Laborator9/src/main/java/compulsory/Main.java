package compulsory;

import TabelEntity.GenresEntity;
import TabelEntity.MoviesEntity;

public class Main {
    public static void main(String[] args) {
        MoviesEntity movie1 = new MoviesEntity();
        movie1.setTitle("3096");
        movie1.setIdMovie("1");
        movie1.setDuration(90);
        movie1.setScore(7);
        movie1.setRealeaseDate("10-01-2019");
        MovieRepoImpl MRepo=new MovieRepoImpl();
        MRepo.begin();
        MRepo.create(movie1);
        MRepo.commit();
        MRepo.close();
        MoviesEntity movie2 = new MoviesEntity();
        movie2.setTitle("Anabella");
        movie2.setIdMovie("2");
        movie2.setDuration(100);
        movie2.setScore(5);
        movie2.setRealeaseDate("20-11-2009");
        MRepo.begin();
        MRepo.create(movie2);
        MRepo.commit();
        MRepo.close();
        System.out.println(MRepo.findById("1").toString());
        System.out.println(MRepo.findByName("Anabella").toString());

        GenresEntity gen1=new GenresEntity();
        gen1.setIdGen("1");
        gen1.setName("Drama");
        GenresEntity gen2=new GenresEntity();
        gen2.setIdGen("2");
        gen2.setName("Comedie");
        GenresEntity gen3=new GenresEntity();
        gen3.setIdGen("3");
        gen3.setName("Drama");
        GenreRepoImpl GRepo=new GenreRepoImpl();
          GRepo.begin();
        GRepo.create(gen1);
        GRepo.create(gen2);
        GRepo.create(gen3);
        GRepo.commit();
        GRepo.close();
        System.out.println(GRepo.findByName("Drama").toString());


    }
}
