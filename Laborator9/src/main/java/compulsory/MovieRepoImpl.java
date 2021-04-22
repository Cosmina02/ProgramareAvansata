package compulsory;

import TabelEntity.MoviesEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class MovieRepoImpl implements MovieRepo {
    private final EntityManager entityManager;

    public MovieRepoImpl() {
        this.entityManager = Management.getInstance().getEm();
    }
    public void begin()
    {
        this.entityManager.getTransaction().begin();
    }
    public void commit() {
        this.entityManager.getTransaction().commit();
    }

    public void close() {
        this.entityManager.close();
    }

    @Override
    public void create(MoviesEntity movie) {
        entityManager.persist(movie);
    }

    @Override
    public MoviesEntity findById(String id) {
        return entityManager.find(MoviesEntity.class, id);
    }

    @Override
    public List<MoviesEntity> findByName(String name) {
        Query query = entityManager.createQuery(
                "SELECT m FROM MoviesEntity  m where m.title LIKE :name")
                .setParameter("name", name);
        return query.getResultList();
    }
}
