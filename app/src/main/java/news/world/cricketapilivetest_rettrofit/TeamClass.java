package news.world.cricketapilivetest_rettrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamClass {

    @SerializedName("data")
    @Expose
    List<TeamClassElement> teamData = null;

    public List<TeamClassElement> getTeamData() {
        return teamData;
    }

    public void setTeamData(List<TeamClassElement> teamData) {
        this.teamData = teamData;
    }
}
