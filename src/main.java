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


        PokemonFuego charmander = new PokemonFuego("charmander", 70, 80, 100);
        PokemonFuego magmar = new PokemonFuego("magmar", 90, 80, 120);
        PokemonAgua blastoise = new PokemonAgua("blastoise", 10, 60, 110);
        PokemonAgua vaporeon = new PokemonAgua("vaporeon", 44, 86, 140);
        PokemonPlanta bulbasur = new PokemonPlanta("bulbasur", 87, 41, 94);
        PokemonPlanta lucho = new PokemonPlanta("lucho", 56, 60, 240);

        pokemones.add(charmander);
        pokemones.add(magmar    );
        pokemones.add(blastoise);
        pokemones.add(vaporeon);
        pokemones.add(bulbasur);
        pokemones.add(lucho);

        for (Pokemon todos : pokemones) {
            System.out.println(todos);
        }

        ArrayList<Capturable> team = new ArrayList<Capturable>();

        team.add(charmander);
        team.add(magmar);
        team.add(blastoise);
        team.add(vaporeon);
        team.add(bulbasur);
        team.add(lucho);

        for (Capturable entidad : team) {
            System.out.println(entidad.capturar());
        }
    }


}
