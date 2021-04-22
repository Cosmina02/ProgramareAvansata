package compulsory;

import TabelEntity.MoviesEntity;

import java.util.List;

public interface MovieRepo {
    void create(MoviesEntity movie);
    MoviesEntity findById(String id);
    List<MoviesEntity> findByName(String name);

}
