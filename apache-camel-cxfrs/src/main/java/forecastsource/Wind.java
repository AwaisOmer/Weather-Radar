
package forecastsource;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "speed",
    "deg"
})
public class Wind {

    @JsonProperty("speed")
    private double speed;
    @JsonProperty("deg")
    private double deg;

    /**
     * 
     * @return
     *     The speed
     */
    @JsonProperty("speed")
    public double getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    @JsonProperty("speed")
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * 
     * @return
     *     The deg
     */
    @JsonProperty("deg")
    public double getDeg() {
        return deg;
    }

    /**
     * 
     * @param deg
     *     The deg
     */
    @JsonProperty("deg")
    public void setDeg(double deg) {
        this.deg = deg;
    }

}
