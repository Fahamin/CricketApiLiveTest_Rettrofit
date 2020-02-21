package news.world.cricketapilivetest_rettrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Country_DataClass {

    @SerializedName("data")
    @Expose
    private List<CountryDataElement> data = null;

    public Country_DataClass() {
    }

    public Country_DataClass(List<CountryDataElement> data) {
        super();
        this.data = data;
    }

    public List<CountryDataElement> getData() {
        return data;
    }

    public void setData(List<CountryDataElement> data) {
        this.data = data;
    }
}