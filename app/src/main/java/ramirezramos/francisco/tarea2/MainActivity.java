package ramirezramos.francisco.tarea2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import ramirezramos.francisco.tarea2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configura el NavController
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController);

    }

    // Método para manejar el clic en un juego
    public void characterClicked(AppData character, View view) {
        // Crear un Bundle para pasar los datos al GameDetailFragment
        Bundle bundle = new Bundle();
        bundle.putString("name", character.getName()); // Pasa el nombre del juego
        bundle.putString("image", character.getImage()); // Pasa la imagen del juego
        bundle.putString("description", character.getDescription()); // Pasa la descripción o más datos que necesites

        // Navegar al GameDetailFragment con el Bundle
        Navigation.findNavController(view).navigate(R.id.AppDetailFragment, bundle);
    }
    @Override
    public boolean onSupportNavigateUp() {
        // Utiliza el método navigateUp del NavController
        return navController.navigateUp() || super.onSupportNavigateUp();
    }

}