package TabelEntity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movies", schema = "main")
public class MoviesEntity {
    private String idMovie;
    private String title;
    private String realeaseDate;
    private double duration;
    private float score;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @Id
    @Column(name = "id_movie")
    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }


    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "realease_date")
    public String getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(String realeaseDate) {
        this.realeaseDate = realeaseDate;
    }

    @Basic
    @Column(name = "duration")
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "score")
    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoviesEntity that = (MoviesEntity) o;

        if (idMovie != null ? !idMovie.equals(that.idMovie) : that.idMovie != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (realeaseDate != null ? !realeaseDate.equals(that.realeaseDate) : that.realeaseDate != null) return false;
        if (Objects.equals(duration, that.duration)) {
            if (!Objects.equals(score, that.score)) return false;

            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = idMovie != null ? idMovie.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (realeaseDate != null ? realeaseDate.hashCode() : 0);
       // result = 31 * result + (!Objects.equals(duration, null) ? duration.hashCode() : 0);
        //result = 31 * result + (!Objects.equals(score, null) ? score.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MoviesEntity{" +
                "idMovie='" + idMovie + '\'' +
                ", title='" + title + '\'' +
                ", realeaseDate='" + realeaseDate + '\'' +
                ", duration=" + duration +
                ", score=" + score +
                '}';
    }
}
