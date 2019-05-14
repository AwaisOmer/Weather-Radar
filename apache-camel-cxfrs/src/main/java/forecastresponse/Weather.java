
package forecastresponse;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Tempreture",
    "Humidity",
    "Pressure",
    "TempretureMin",
    "TempretureMax",
    "SeaLevel",
    "GroundLevel",
    "WindSpeed",
    "WindDegree",
    "Description"
})
public class Weather {

    @JsonProperty("Tempreture")
    private int Tempreture;
    @JsonProperty("Humidity")
    private String Humidity;
    @JsonProperty("Pressure")
    private int Pressure;
    @JsonProperty("TempretureMin")
    private int TempretureMin;
    @JsonProperty("TempretureMax")
    private int TempretureMax;
    @JsonProperty("SeaLevel")
    private double SeaLevel;
    @JsonProperty("GroundLevel")
    private double GroundLevel;
    @JsonProperty("WindSpeed")
    private double WindSpeed;
    @JsonProperty("WindDegree")
    private double WindDegree;
    @JsonProperty("Description")
    private String Description;

    /**
     * 
     * @return
     *     The Tempreture
     */
    @JsonProperty("Tempreture")
    public int getTempreture() {
        return Tempreture;
    }

    /**
     * 
     * @param Tempreture
     *     The Tempreture
     */
    @JsonProperty("Tempreture")
    public void setTempreture(int Tempreture) {
        this.Tempreture = Tempreture;
    }

    /**
     * 
     * @return
     *     The Humidity
     */
    @JsonProperty("Humidity")
    public String getHumidity() {
        return Humidity;
    }

    /**
     * 
     * @param Humidity
     *     The Humidity
     */
    @JsonProperty("Humidity")
    public void setHumidity(String Humidity) {
        this.Humidity = Humidity;
    }

    /**
     * 
     * @return
     *     The Pressure
     */
    @JsonProperty("Pressure")
    public int getPressure() {
        return Pressure;
    }

    /**
     * 
     * @param Pressure
     *     The Pressure
     */
    @JsonProperty("Pressure")
    public void setPressure(int Pressure) {
        this.Pressure = Pressure;
    }

    /**
     * 
     * @return
     *     The TempretureMin
     */
    @JsonProperty("TempretureMin")
    public int getTempretureMin() {
        return TempretureMin;
    }

    /**
     * 
     * @param TempretureMin
     *     The TempretureMin
     */
    @JsonProperty("TempretureMin")
    public void setTempretureMin(int TempretureMin) {
        this.TempretureMin = TempretureMin;
    }

    /**
     * 
     * @return
     *     The TempretureMax
     */
    @JsonProperty("TempretureMax")
    public int getTempretureMax() {
        return TempretureMax;
    }

    /**
     * 
     * @param TempretureMax
     *     The TempretureMax
     */
    @JsonProperty("TempretureMax")
    public void setTempretureMax(int TempretureMax) {
        this.TempretureMax = TempretureMax;
    }

    /**
     * 
     * @return
     *     The SeaLevel
     */
    @JsonProperty("SeaLevel")
    public double getSeaLevel() {
        return SeaLevel;
    }

    /**
     * 
     * @param SeaLevel
     *     The SeaLevel
     */
    @JsonProperty("SeaLevel")
    public void setSeaLevel(double SeaLevel) {
        this.SeaLevel = SeaLevel;
    }

    /**
     * 
     * @return
     *     The GroundLevel
     */
    @JsonProperty("GroundLevel")
    public double getGroundLevel() {
        return GroundLevel;
    }

    /**
     * 
     * @param GroundLevel
     *     The GroundLevel
     */
    @JsonProperty("GroundLevel")
    public void setGroundLevel(double GroundLevel) {
        this.GroundLevel = GroundLevel;
    }

    /**
     * 
     * @return
     *     The WindSpeed
     */
    @JsonProperty("WindSpeed")
    public double getWindSpeed() {
        return WindSpeed;
    }

    /**
     * 
     * @param WindSpeed
     *     The WindSpeed
     */
    @JsonProperty("WindSpeed")
    public void setWindSpeed(double WindSpeed) {
        this.WindSpeed = WindSpeed;
    }

    /**
     * 
     * @return
     *     The WindDegree
     */
    @JsonProperty("WindDegree")
    public double getWindDegree() {
        return WindDegree;
    }

    /**
     * 
     * @param WindDegree
     *     The WindDegree
     */
    @JsonProperty("WindDegree")
    public void setWindDegree(double WindDegree) {
        this.WindDegree = WindDegree;
    }

    /**
     * 
     * @return
     *     The Description
     */
    @JsonProperty("Description")
    public String getDescription() {
        return Description;
    }

    /**
     * 
     * @param Description
     *     The Description
     */
    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

}
