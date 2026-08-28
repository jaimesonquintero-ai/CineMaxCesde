package app.domain;

public class Movie {

    protected Integer id;
    protected String title;
    protected String description;
    protected String genre;
    protected Integer duration;

    // Constructor vacío
    public Movie() {

    }

    // Getters y Setters

    public Integer getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Métodos

    public void create() {

    }

    public void selectAll() {

    }

    public void selectById(int id) {

    }

    public void update() {

    }

    public void delete(int id) {

    }
}