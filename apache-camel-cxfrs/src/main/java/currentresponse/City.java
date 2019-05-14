
package currentresponse;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "City",
    "Country",
    "Population",
    "Longitude",
    "Latitude"
})
public class City {

    @JsonProperty("City")
    private String City;
    @JsonProperty("Country")
    private String Country;
    @JsonProperty("Population")
    private int Population;
    @JsonProperty("Longitude")
    private int Longitude;
    @JsonProperty("Latitude")
    private int Latitude;

    /**
     * 
     * @return
     *     The City
     */
    @JsonProperty("City")
    public String getCity() {
        return City;
    }

    /**
     * 
     * @param City
     *     The City
     */
    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * 
     * @return
     *     The Country
     */
    @JsonProperty("Country")
    public String getCountry() {
        return Country;
    }

    /**
     * 
     * @param Country
     *     The Country
     */
    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * 
     * @return
     *     The Population
     */
    @JsonProperty("Population")
    public int getPopulation() {
        return Population;
    }

    /**
     * 
     * @param Population
     *     The Population
     */
    @JsonProperty("Population")
    public void setPopulation(int Population) {
        this.Population = Population;
    }

    /**
     * 
     * @return
     *     The Longitude
     */
    @JsonProperty("Longitude")
    public int getLongitude() {
        return Longitude;
    }

    /**
     * 
     * @param Longitude
     *     The Longitude
     */
    @JsonProperty("Longitude")
    public void setLongitude(int Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * 
     * @return
     *     The Latitude
     */
    @JsonProperty("Latitude")
    public int getLatitude() {
        return Latitude;
    }

    /**
     * 
     * @param Latitude
     *     The Latitude
     */
    @JsonProperty("Latitude")
    public void setLatitude(int Latitude) {
        this.Latitude = Latitude;
    }

}
