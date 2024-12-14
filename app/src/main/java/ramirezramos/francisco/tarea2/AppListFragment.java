package ramirezramos.francisco.tarea2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ramirezramos.francisco.tarea2.databinding.AppListFragmentBinding;

import java.util.ArrayList;

public class AppListFragment extends Fragment {

    private @NonNull AppListFragmentBinding binding; // Binding para el layout
    private ArrayList<AppData> characters; // Lista de personajes
    private AppRecyclerViewAdapter adapter; // Adaptador del recyclerView


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflar el layout utilizando el binding
        binding = AppListFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Inicializa la lista de personajes
        loadCharacters(); // Los carga

        // Configura el recyclerView
        adapter = new AppRecyclerViewAdapter(characters, getActivity());
        binding.charactersRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.charactersRecyclerview.setAdapter(adapter);


    }

    // Método para cargar juegos (puedes implementar tu lógica aquí)
    private void loadCharacters() {
        characters = new ArrayList<AppData>();
        // Llenar la lista con datos de videojuegos
        characters.add(new AppData(
                "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2023/04/super-mario-png-transparente.png?resize=600%2C600&ssl=1", // Reemplaza con la ruta de la imagen
                "Mario",
                "El héroe principal del Reino Champiñón. Mario es muy positivo y siempre está alegre. Lo podrás reconocer por sus overoles de color azul, su gorra roja y su característico bigote.. Here we go!!"
        ));

        characters.add(new AppData(
                "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2023/04/Luigi-Mario-Bros-png.png?w=1000&ssl=1", // Reemplaza con la ruta de la imagen
                "Luigi",
                "Hermano de Mario y héroe del Reino Champiñón. Luigi es reconocido instantáneamente por su gorra y camisa de color verde."

        ));

        characters.add(new AppData(
                "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2022/08/super-mario-toad.png?resize=768%2C768&ssl=1", // Reemplaza con la ruta de la imagen
                "Toad",
                "Residente del Reino Champiñón, trabaja al servicio de la Princesa Peach. Toad tiene manchas rojas en la cabeza, aunque otros de su especie vienen en una variedad de colores."
        ));

        characters.add(new AppData(
                "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2022/08/princess-peach-png.png?resize=768%2C768&ssl=1", // Reemplaza con la ruta de la imagen
                "Princesa Peach",
                "La querida princesa del Reino Champiñón. Es extremadamente amable y siempre está trabajando para crear un mundo en el que todos puedan convivir juntos y felices."
        ));

        characters.add(new AppData(
                "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2023/04/bowser-png-Transparent.png?w=1000&ssl=1", // Reemplaza con la ruta de la imagen
                "Bowser",
                "El rey de los Koopas. Bowser es el archienemigo de Mario y siempre está causando estragos en el Reino Champiñón."
        ));

        characters.add(new AppData(
                "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2023/04/yoshi-png.png?resize=600%2C600&ssl=1", // Reemplaza con la ruta de la imagen
                "Yoshi",
                "El confiable compañero de Mario originario de la Isla de Yoshi. Es de color verde, pero otros de su especie vienen de otros colores, como rojo, azul, rosa y amarillo."
        ));

        characters.add(new AppData(
                "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2022/08/super-mario-toadette.png?resize=768%2C768&ssl=1", // Reemplaza con la ruta de la imagen
                "Toadette",
                "Toadette tiene una gorra rosa con lunares blancos, que parece un simple cambio de los colores de los otros toads ya vistos. Ella tiene un conjunto único de trenzas."
        ));

        characters.add(new AppData(
                "https://static.wikia.nocookie.net/mario/images/b/b0/Goomba_%28MPSS%29.png/revision/latest?cb=20211226140521&path-prefix=es", // Reemplaza con la ruta de la imagen
                "Goomba",
                "Antiguamente, los Goombas vivían en el Reino Champiñón, donde convivían con los Toads pacíficamente. No obstante, Pero, los Goombas decidieron unirse a las filas de Bowser."
        ));

        characters.add(new AppData(
                "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2023/04/turtles-with-wings-super-mario-png.png?resize=600%2C600&ssl=1", // Reemplaza con la ruta de la imagen
                "Koopa (o Paratroopa)",
                "Los Paratroopa son las clásicas tortugas con alas del mundo de Mario. Su función es la misma que la de los Koopa: acabar con Mario por orden de Bowser.."
        ));

        characters.add(new AppData(
                "https://static.wikia.nocookie.net/mario/images/4/40/Tn_051303_warioworld_wario05.jpg/revision/latest?cb=20120119225016&path-prefix=es", // Reemplaza con la ruta de la imagen
                "Wario",
                "La antítesis malvada de Mario. Esto se refleja en su personalidad malvada, y su gran astucia, todo lo contrario de Mario."
        ));
    }


    @Override
    public void onStart() {
        super.onStart();
        // Cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.marioapp);
        }
    }
}