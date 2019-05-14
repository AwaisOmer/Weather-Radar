
package forecastsource;

import java.util.ArrayList;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "cod",
    "message",
    "cnt",
    "list",
    "city"
})
public class ForecastSource {

    @JsonProperty("cod")
    private String cod;
    @JsonProperty("message")
    private double message;
    @JsonProperty("cnt")
    private int cnt;
    @JsonProperty("list")
    private java.util.List<forecastsource.List> list = new ArrayList<forecastsource.List>();
    @JsonProperty("city")
    private City city;

    /**
     * 
     * @return
     *     The cod
     */
    @JsonProperty("cod")
    public String getCod() {
        return cod;
    }

    /**
     * 
     * @param cod
     *     The cod
     */
    @JsonProperty("cod")
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public double getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(double message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The cnt
     */
    @JsonProperty("cnt")
    public int getCnt() {
        return cnt;
    }

    /**
     * 
     * @param cnt
     *     The cnt
     */
    @JsonProperty("cnt")
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    /**
     * 
     * @return
     *     The list
     */
    @JsonProperty("list")
    public java.util.List<forecastsource.List> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    @JsonProperty("list")
    public void setList(java.util.List<forecastsource.List> list) {
        this.list = list;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

}
