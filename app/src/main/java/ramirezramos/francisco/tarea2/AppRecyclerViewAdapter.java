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

    // Metodo que crea el ViewHolder
    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AppCardviewBinding binding = AppCardviewBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent,false
        );
        return new AppViewHolder(binding);
    }

    // enlazar datos con ViewHolder
    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        AppData currentCharacter = this.characters.get(position);
        holder.bind(currentCharacter);

     // on_click_listener
        holder.itemView.setOnClickListener(view -> itemClicked(currentCharacter, view));
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    private void itemClicked(AppData currentCharacter, View view) {
        // se ejecuta CharacterClicked de MainActivity,pulsando sobre el personaje
        ((MainActivity) context).characterClicked(currentCharacter, view);
    }
}
