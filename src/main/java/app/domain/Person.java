package app.domain;

public class Person {

    protected Integer id;
    protected String name;
    protected String lastName;
    protected String email;
    protected String phone;
    protected String password;
    protected boolean state;

    // Constructor vacío
    public Person() {

    }

    // Getter
    public Integer getId() {
        return this.id;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
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

    private void selectState(int id) {

    }
}