package azz.lokcay.hewanar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    ImageView photo;
    TextView nama,detail;
    Button buttonVR;
    private RecyclerView rvRow, rvHewan;
    private ArrayList<Hewan> list = new ArrayList<>( );

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );

        Intent i = getIntent();

        final String nma = i.getStringExtra( "nama" );
        final String ditail = i.getStringExtra( "detail" );
        final String ktgr = i.getStringExtra( "kategori" );
        final Integer gambar = i.getIntExtra( "photo",0 );

        photo = findViewById( R.id.img_item_photo );
        nama = findViewById( R.id.tv_item_name );
        detail = findViewById( R.id.tv_detail );
        buttonVR = findViewById( R.id.btn_Ar );

        Glide.with( this ).load( gambar ).into( photo );
        nama.setText(nma);
        detail.setText( ditail );
    }


    public void arBTn(View view) {
        Toast.makeText( this, "Button Ini masih dalam pengembangan", Toast.LENGTH_SHORT ).show();
    }
}
