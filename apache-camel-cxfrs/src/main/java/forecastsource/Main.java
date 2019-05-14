
package forecastsource;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "temp",
    "temp_min",
    "temp_max",
    "pressure",
    "sea_level",
    "grnd_level",
    "humidity",
    "temp_kf"
})
public class Main {

    @JsonProperty("temp")
    private double temp;
    @JsonProperty("temp_min")
    private double tempMin;
    @JsonProperty("temp_max")
    private double tempMax;
    @JsonProperty("pressure")
    private double pressure;
    @JsonProperty("sea_level")
    private double seaLevel;
    @JsonProperty("grnd_level")
    private double grndLevel;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("temp_kf")
    private double tempKf;

    /**
     * 
     * @return
     *     The temp
     */
    @JsonProperty("temp")
    public double getTemp() {
        return temp;
    }

    /**
     * 
     * @param temp
     *     The temp
     */
    @JsonProperty("temp")
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * 
     * @return
     *     The tempMin
     */
    @JsonProperty("temp_min")
    public double getTempMin() {
        return tempMin;
    }

    /**
     * 
     * @param tempMin
     *     The temp_min
     */
    @JsonProperty("temp_min")
    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    /**
     * 
     * @return
     *     The tempMax
     */
    @JsonProperty("temp_max")
    public double getTempMax() {
        return tempMax;
    }

    /**
     * 
     * @param tempMax
     *     The temp_max
     */
    @JsonProperty("temp_max")
    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    @JsonProperty("pressure")
    public double getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    @JsonProperty("pressure")
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    /**
     * 
     * @return
     *     The seaLevel
     */
    @JsonProperty("sea_level")
    public double getSeaLevel() {
        return seaLevel;
    }

    /**
     * 
     * @param seaLevel
     *     The sea_level
     */
    @JsonProperty("sea_level")
    public void setSeaLevel(double seaLevel) {
        this.seaLevel = seaLevel;
    }

    /**
     * 
     * @return
     *     The grndLevel
     */
    @JsonProperty("grnd_level")
    public double getGrndLevel() {
        return grndLevel;
    }

    /**
     * 
     * @param grndLevel
     *     The grnd_level
     */
    @JsonProperty("grnd_level")
    public void setGrndLevel(double grndLevel) {
        this.grndLevel = grndLevel;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    /**
     * 
     * @return
     *     The tempKf
     */
    @JsonProperty("temp_kf")
    public double getTempKf() {
        return tempKf;
    }

    /**
     * 
     * @param tempKf
     *     The temp_kf
     */
    @JsonProperty("temp_kf")
    public void setTempKf(double tempKf) {
        this.tempKf = tempKf;
    }

}
