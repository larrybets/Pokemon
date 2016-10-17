import java.util.Random;

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

    public static int valor_r(){
        Random r = new Random();
        return r.nextInt((120 - 20) + 1) + 20;
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
        int valor1 = valor_r();
        if(valor1-getPuntosSalud()>getDefensa()){
            System.out.println(getNombre()+ " dentro!");
            return true;


        }else{
            System.out.println("se escapo!");
            System.out.println("valor : " + valor1);
        }
        return false;
    }
}
