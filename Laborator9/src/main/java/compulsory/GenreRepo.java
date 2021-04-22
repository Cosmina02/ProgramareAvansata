package compulsory;

import TabelEntity.GenresEntity;
import java.util.List;

public interface GenreRepo {
    void create(GenresEntity gen);
    GenresEntity findById(String id);
    List<GenresEntity> findByName(String name);
}
