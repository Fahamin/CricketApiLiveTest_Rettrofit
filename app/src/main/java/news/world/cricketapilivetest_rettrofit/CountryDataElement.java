package news.world.cricketapilivetest_rettrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountryDataElement {

    @SerializedName("resource")
    @Expose
    private String resource;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("country_id")
    @Expose
    private int countryId;
    @SerializedName("national_team")
    @Expose
    private Boolean nationalTeam;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

   
    public CountryDataElement() {
    }

    public CountryDataElement(String resource, int id, String name, String code, String imagePath, int countryId, Boolean nationalTeam, String updatedAt) {
        super();
        this.resource = resource;
        this.id = id;
        this.name = name;
        this.code = code;
        this.imagePath = imagePath;
        this.countryId = countryId;
        this.nationalTeam = nationalTeam;
        this.updatedAt = updatedAt;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Boolean getNationalTeam() {
        return nationalTeam;
    }

    public void setNationalTeam(Boolean nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}