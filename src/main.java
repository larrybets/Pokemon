import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by DAM on 3/10/16.
 */
public class main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("nombre", 40, 30, 75);
        System.out.println(pokemon);

        ArrayList<Pokemon> pokemones = new ArrayList<>();


        PokemonFuego charmander = new PokemonFuego("charmander", 70, 1, 20);
        PokemonFuego magmar = new PokemonFuego("magmar", 90, 1, 120);
        PokemonAgua blastoise = new PokemonAgua("blastoise", 10, 1, 11);
        PokemonAgua vaporeon = new PokemonAgua("vaporeon", 44, 1, 14);
        PokemonPlanta bulbasur = new PokemonPlanta("bulbasur", 200, 1, 2);
        PokemonPlanta lucho = new PokemonPlanta("lucho", 56,1, 2);
        Constipado constipado = new Constipado();
        pokemones.add(charmander);
        pokemones.add(magmar);
        pokemones.add(blastoise);
        pokemones.add(vaporeon);
        pokemones.add(bulbasur);
        pokemones.add(lucho);

        ArrayList<Capturable> team = new ArrayList();
        team.add(charmander);
        team.add(magmar);
        team.add(blastoise);
        team.add(vaporeon);
        team.add(bulbasur);
        team.add(lucho);
        team.add(constipado);

        for (Capturable entidad : team) {
            System.out.println(entidad.capturar());

        }


    }


}
