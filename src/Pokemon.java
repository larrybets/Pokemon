/**
 * Created by DAM on 3/10/16.
 */
public class Pokemon {
    private String nombre;
    private int ataque;
    private int defensa;
    private int puntosSalud;

    public Pokemon(String nombre, int ataque, int defensa, int puntosSalud) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.puntosSalud = puntosSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }


    @Override
    public String  toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", puntosSalud=" + puntosSalud +
                '}';
    }
}
