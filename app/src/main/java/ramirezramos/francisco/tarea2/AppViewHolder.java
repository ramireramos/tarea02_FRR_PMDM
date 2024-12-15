package ramirezramos.francisco.tarea2;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import ramirezramos.francisco.tarea2.databinding.AppCardviewBinding;

public class AppViewHolder extends RecyclerView.ViewHolder {
    private final AppCardviewBinding binding; // Declaramos Appcardviewbinding

     public AppViewHolder(AppCardviewBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }    // Constructor del ViewHolder

    // Metodo para enlazar los datos del personaje con las vistas
    public void bind (AppData character){
        Picasso.get() // usamos libreria picasso para que se muestren imagenes online
                .load(character.getImage())
                .into(binding.image);
        binding.character.setText(character.getName()); // Establece el nombre del personaje
        binding.character.setText(character.getName()); // Establece la descripción del personaje en el TextView correspondiente
        binding.description.setText(String.valueOf(character.getDescription())); binding.character.setText(character.getName()); // Establece la descripción del personaje en el TextView correspondiente
        binding.executePendingBindings();
    }
}