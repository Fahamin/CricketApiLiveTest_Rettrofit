package news.world.cricketapilivetest_rettrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("teams")
    Call<Country_DataClass> getALLdata(@Query("api_token") String token);

    @GET("players")
    Call<TeamClass> getTeamPlayers( @Query("country_id") int cid,@Query("api_token") String token);

}
