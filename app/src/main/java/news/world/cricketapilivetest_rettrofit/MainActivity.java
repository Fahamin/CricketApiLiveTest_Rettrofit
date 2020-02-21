package news.world.cricketapilivetest_rettrofit;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // https://cricket.sportmonks.com/api/v2.0

// api token = etYSe89yaVnprP8KevT4vNmYeiBETmaKzMPGmcsUCKgCOuJNfkvVp9UC2OMC ;

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://cricket.sportmonks.com/api/v2.0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<Country_DataClass> call = api.getALLdata("etYSe89yaVnprP8KevT4vNmYeiBETmaKzMPGmcsUCKgCOuJNfkvVp9UC2OMC");


        call.enqueue(new Callback<Country_DataClass>() {
            @Override
            public void onResponse(Call<Country_DataClass> call, Response<Country_DataClass> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        List<CountryDataElement> list = response.body().getData();

                        int cid = list.get(10).getCountryId();
                        String tName = list.get(10).getName();
 /*for(CountryDataElement  datum : list)
                        {
                            Toast.makeText(MainActivity.this, datum.getName(), Toast.LENGTH_SHORT).show();
                        }*/

                        Call<TeamClass> teamClassCall = api.getTeamPlayers(cid,"etYSe89yaVnprP8KevT4vNmYeiBETmaKzMPGmcsUCKgCOuJNfkvVp9UC2OMC");

                        teamClassCall.enqueue(new Callback<TeamClass>() {
                            @Override
                            public void onResponse(Call<TeamClass> call, Response<TeamClass> response) {

                                if(response.isSuccessful())
                                {
                                    if(response.body() != null)
                                    {
                                        List<TeamClassElement> plList = response.body().getTeamData();

                                        for(TeamClassElement classElement : plList)
                                        {
                                            Toast.makeText(MainActivity.this, classElement.getFullname(), Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }
                            }

                            @Override
                            public void onFailure(Call<TeamClass> call, Throwable t) {

                            }
                        });

                    }

                }
            }

            @Override
            public void onFailure(Call<Country_DataClass> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
