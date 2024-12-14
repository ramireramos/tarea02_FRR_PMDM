package ramirezramos.francisco.tarea2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import ramirezramos.francisco.tarea2.databinding.AppCardviewBinding;
import android.view.View;

public class AppRecyclerViewAdapter extends RecyclerView.Adapter<AppViewHolder> {

    private final ArrayList<AppData> characters;
    private final Context context;

    public AppRecyclerViewAdapter (ArrayList<AppData> characters, Context context){
        this.characters = characters;
        this.context = context;
    }

    // Método que crea el ViewHolder
    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AppCardviewBinding binding = AppCardviewBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent,false
        );
        return new AppViewHolder(binding);
    }

    //    Método para enlazar datos con ek ViewHolder
    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        AppData currentCharacter = this.characters.get(position);
        holder.bind(currentCharacter);

//        Manejar el evento de clic
        holder.itemView.setOnClickListener(view -> itemClicked(currentCharacter, view));
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    private void itemClicked(AppData currentCharacter, View view) {
        // Llama a la función gameClicked de MainActivity, pasando la vista
        ((MainActivity) context).characterClicked(currentCharacter, view);
    }
}
