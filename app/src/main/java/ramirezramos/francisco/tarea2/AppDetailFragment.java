package ramirezramos.francisco.tarea2;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import ramirezramos.francisco.tarea2.databinding.AppDetailFragmentBinding;

public class AppDetailFragment extends Fragment {

    private AppDetailFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el layout para este fragmento
        binding = AppDetailFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener datos del argumento que inicia este fragmento
        if (getArguments() != null) {
            String image = getArguments().getString("image");
            String name = getArguments().getString("name");
            String description = getArguments().getString("description");

            // Asignar los datos a los componentes
            Picasso.get()
                    .load(image)
                    .into(binding.image);
            binding.name.setText(name);
            binding.description.setText(description);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        // Cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.character_description);
        }
    }
}