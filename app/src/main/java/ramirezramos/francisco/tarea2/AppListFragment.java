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
    private ArrayList<AppData> characters; // Lista de juegos
    private AppRecyclerViewAdapter adapter; // Adaptador del RecyclerView


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

        // Inicializa la lista de juegos
        loadCharacters(); // Cargar los juegos (puedes implementar esta función para obtener datos)

        // Configurar el RecyclerView
        adapter = new AppRecyclerViewAdapter(characters, getActivity());
        binding.charactersRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.charactersRecyclerview.setAdapter(adapter);


    }

    // Método para cargar juegos (puedes implementar tu lógica aquí)
    private void loadCharacters() {
        characters = new ArrayList<AppData>();
        // Llenar la lista con datos de videojuegos
        characters.add(new AppData(
                "https://m.media-amazon.com/images/I/71uS8Ra1aGL._AC_UF894,1000_QL80_.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario Bros. Wonder",
                "Un juego de plataformas en un mundo vibrante lleno de sorpresas."
        ));

        characters.add(new AppData(
                "https://m.media-amazon.com/images/I/71C9pOGlKtL.jpg", // Reemplaza con la ruta de la imagen
                "Mario Kart 8 Deluxe",
                "Una versión mejorada de Mario Kart 8 con un modo de batalla renovado."

        ));

        characters.add(new AppData(
                "https://m.media-amazon.com/images/I/81CbYA2Gt3L._AC_UF894,1000_QL80_.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario 3D World + Bowser's Fury",
                "Aventura cooperativa en 3D con una misión en el mundo abierto de Bowser's Fury."
        ));

        characters.add(new AppData(
                "https://m.media-amazon.com/images/I/81d3KS1-6OL.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario Maker 2",
                "Diseña y comparte tus propios niveles de Mario en esta secuela."
        ));

        characters.add(new AppData(
                "https://m.media-amazon.com/images/I/81drkVN7GRL._AC_UF1000,1000_QL80_.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario Odyssey",
                "Mario debe rescatar a la Princesa Peach utilizando su compañero, Cappy."
        ));

        characters.add(new AppData(
                "https://m.media-amazon.com/images/I/71FxEVBYddL._AC_UF1000,1000_QL80_.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario All-Stars",
                "Colección remasterizada de los clásicos juegos de Mario."
        ));

        characters.add(new AppData(
                "https://m.media-amazon.com/images/I/81XdRd9UNZL.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario Party",
                "Un juego de fiesta con tableros virtuales y mini-juegos."
        ));

        characters.add(new AppData(
                "https://m.media-amazon.com/images/I/91bAhoyCcUL.jpg", // Reemplaza con la ruta de la imagen
                "Mario Golf: Super Rush",
                "Un enfoque divertido del golf con personajes de Mario."
        ));

        characters.add(new AppData(
                "https://media.vandal.net/m/85340/paper-mario-the-origami-king-20205141527529_1.jpg", // Reemplaza con la ruta de la imagen
                "Paper Mario: The Origami King",
                "Mario debe detener al Rey Origami en esta aventura de rol."
        ));

        characters.add(new AppData(
                "https://m.media-amazon.com/images/I/81zgWwSnVfL.jpg", // Reemplaza con la ruta de la imagen
                "Mario + Rabbids Sparks of Hope",
                "Mario y los Rabbids deben salvar a los Sparks en esta aventura."
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