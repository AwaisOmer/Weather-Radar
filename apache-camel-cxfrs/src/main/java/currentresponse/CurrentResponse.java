
package currentresponse;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "City",
    "Weather",
    "DateTime"
})
public class CurrentResponse {

    @JsonProperty("City")
    private currentresponse.City City;
    @JsonProperty("Weather")
    private currentresponse.Weather Weather;
    @JsonProperty("DateTime")
    private String DateTime;

    /**
     * 
     * @return
     *     The City
     */
    @JsonProperty("City")
    public currentresponse.City getCity() {
        return City;
    }

    /**
     * 
     * @param City
     *     The City
     */
    @JsonProperty("City")
    public void setCity(currentresponse.City City) {
        this.City = City;
    }

    /**
     * 
     * @return
     *     The Weather
     */
    @JsonProperty("Weather")
    public currentresponse.Weather getWeather() {
        return Weather;
    }

    /**
     * 
     * @param Weather
     *     The Weather
     */
    @JsonProperty("Weather")
    public void setWeather(currentresponse.Weather Weather) {
        this.Weather = Weather;
    }

    /**
     * 
     * @return
     *     The DateTime
     */
    @JsonProperty("DateTime")
    public String getDateTime() {
        return DateTime;
    }

    /**
     * 
     * @param DateTime
     *     The DateTime
     */
    @JsonProperty("DateTime")
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

}
