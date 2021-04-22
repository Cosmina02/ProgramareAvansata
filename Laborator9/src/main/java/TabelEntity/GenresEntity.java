package TabelEntity;

import javax.persistence.*;

@Entity
@Table(name = "genres", schema = "main")
public class GenresEntity {
    private String idGen;
    private String name;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @Id
    @Column(name = "id_gen")
    public String getIdGen() {
        return idGen;
    }

    public void setIdGen(String idGen) {
        this.idGen = idGen;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenresEntity that = (GenresEntity) o;

        if (idGen != null ? !idGen.equals(that.idGen) : that.idGen != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGen != null ? idGen.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GenresEntity{" +
                "idGen='" + idGen + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
