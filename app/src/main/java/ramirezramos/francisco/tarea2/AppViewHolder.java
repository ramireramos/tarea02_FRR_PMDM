package ramirezramos.francisco.tarea2;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import ramirezramos.francisco.tarea2.databinding.AppCardviewBinding;

public class AppViewHolder extends RecyclerView.ViewHolder {

    private final AppCardviewBinding binding;

    public AppViewHolder(AppCardviewBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind (AppData app){
        Picasso.get()
                .load(character.getImage())
                .into(binding.image);
        binding.character.setText(character.getName());
        binding.description.setText(String.valueOf(name.description()));
        binding.executePendingBindings(); // Asegura que se apliquen los cambios de inmediato
    }
}