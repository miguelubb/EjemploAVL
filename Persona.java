import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private int id;
    private String nombre;
    private String telefono;

    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        telefono="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return id == persona.id && Objects.equals(nombre, persona.nombre) && Objects.equals(telefono, persona.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, telefono);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
}
