
package forecastresponse;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Weather",
    "DateTime"
})
public class List {

    @JsonProperty("Weather")
    private forecastresponse.Weather Weather;
    @JsonProperty("DateTime")
    private String DateTime;

    /**
     * 
     * @return
     *     The Weather
     */
    @JsonProperty("Weather")
    public forecastresponse.Weather getWeather() {
        return Weather;
    }

    /**
     * 
     * @param Weather
     *     The Weather
     */
    @JsonProperty("Weather")
    public void setWeather(forecastresponse.Weather Weather) {
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
