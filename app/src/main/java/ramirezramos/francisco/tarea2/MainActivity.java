package ramirezramos.francisco.tarea2;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
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
        navController = Navigation.findNavController(this, R.id.nav_host_fragment); //configuramos Navcontroller
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController);


    }

    // metodo on_click sobre personaje
    public void characterClicked(@NonNull AppData character, View view) {
        // Bundle para pasar los datos al AppDetailFragment
        Bundle bundle = new Bundle();
        bundle.putString("character", character.getName()); // nombre personaje
        bundle.putString("image", character.getImage()); // imagen personaje
        bundle.putString("description", character.getDescription()); // descripcion de personaje

        Navigation.findNavController(view).navigate(R.id.appDetailFragment, bundle);
    }
    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp() || super.onSupportNavigateUp();
    }

}