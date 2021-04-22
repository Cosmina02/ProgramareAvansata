package compulsory;

import TabelEntity.GenresEntity;
import TabelEntity.MoviesEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class GenreRepoImpl implements GenreRepo{
    private final EntityManager entityManager;

    public GenreRepoImpl() {
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
    public void create(GenresEntity gen) {
        entityManager.persist(gen);
    }

    @Override
    public GenresEntity findById(String id) {
        return entityManager.find(GenresEntity.class, id);
    }

    @Override
    public List<GenresEntity> findByName(String name) {
        Query query = entityManager.createQuery(
                "SELECT g FROM GenresEntity  g where g.name LIKE :name")
                .setParameter("name", name);
        return query.getResultList();

    }
}
