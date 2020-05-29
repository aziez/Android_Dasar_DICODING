package azz.lokcay.hewanar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHewan;
    private ArrayList<Hewan> list = new ArrayList<>( );

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate( R.menu.main_menu,menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        goProfile(item.getItemId());
        return super.onOptionsItemSelected( item );
    }

    private void goProfile(int itemId) {
        Toast.makeText( this, "Masuk Ke Halaman Profile", Toast.LENGTH_SHORT ).show();
        Intent i = new Intent( MainActivity.this, ProfileActivity.class );
        startActivity( i );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        rvHewan = findViewById( R.id.rv_hewan );
        rvHewan.setHasFixedSize( true );

        list.addAll( HewanData.getListData() );
        showRecyclerList();


    }

    private void showRecyclerList() {
        rvHewan.setLayoutManager( new LinearLayoutManager( this ) );
        ListHewanAdapter listHewanAdapter = new ListHewanAdapter( list );
        rvHewan.setAdapter( listHewanAdapter );

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Apakah Anda Yakin ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
