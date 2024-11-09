package utp.edu.pe.sosapp.dto;

public class User {
    int id;
    String dni;
    String name;
    String password;

    public User() {
    }

    public User(int id, String dni, String name) {
        this.id = id;
        this.dni = dni;
        this.name = name;
    }

    public User(String dni, String name, String password) {
        this.dni = dni;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
