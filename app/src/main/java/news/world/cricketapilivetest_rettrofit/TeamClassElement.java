package news.world.cricketapilivetest_rettrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamClassElement {

    @SerializedName("resource")
    @Expose
    private String resource;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("country_id")
    @Expose
    private int countryId;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("dateofbirth")
    @Expose
    private String dateofbirth;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("position")
    @Expose
    private Position position;


    public TeamClassElement() {
    }

    public TeamClassElement(String resource, int id, int countryId, String firstname, String lastname, String fullname, String imagePath, String dateofbirth, String gender, Position position) {
        super();
        this.resource = resource;
        this.id = id;
        this.countryId = countryId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.fullname = fullname;
        this.imagePath = imagePath;
        this.dateofbirth = dateofbirth;
        this.gender = gender;
        this.position = position;
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

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}