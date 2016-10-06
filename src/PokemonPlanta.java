/**
 * Created by DAM on 5/10/16.
 */
public class PokemonPlanta extends Pokemon implements  Capturable{

    private String tipo = "planta";
    private String debilContra = "fuego";
    private String efectivoContra = "agua";

    public PokemonPlanta(String nombre, int ataque, int defensa, int puntosSalud) {
        super(nombre, ataque, defensa, puntosSalud);

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDebilContra() {
        return debilContra;
    }

    public void setDebilContra(String debilContra) {
        this.debilContra = debilContra;
    }

    public String getEfectivoContra() {
        return efectivoContra;
    }

    public void setEfectivoContra(String efectivoContra) {
        this.efectivoContra = efectivoContra;
    }


    @Override
    public String toString() {


        String padre = super.toString();
        String hijo =  "PokemonPlanta{" +
                "tipo='" + tipo + '\'' +
                ", debilContra='" + debilContra + '\'' +
                ", efectivoContra='" + efectivoContra + '\'' +
                '}';

        return "PokemonPlanta{" +
                "tipo='" + tipo + '\'' +
                ", debilContra='" + debilContra + '\'' +
                ", efectivoContra='" + efectivoContra + '\'' +
                '}';
    }

    @Override
    public boolean capturar() {
        return false;
    }
}
