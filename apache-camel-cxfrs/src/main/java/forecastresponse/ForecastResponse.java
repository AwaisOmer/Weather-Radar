
package forecastresponse;

import java.util.ArrayList;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "City",
    "list"
})
public class ForecastResponse {

    @JsonProperty("City")
    private forecastresponse.City City;
    @JsonProperty("list")
    private java.util.List<forecastresponse.List> list = new ArrayList<forecastresponse.List>();

    /**
     * 
     * @return
     *     The City
     */
    @JsonProperty("City")
    public forecastresponse.City getCity() {
        return City;
    }

    /**
     * 
     * @param City
     *     The City
     */
    @JsonProperty("City")
    public void setCity(forecastresponse.City City) {
        this.City = City;
    }

    /**
     * 
     * @return
     *     The list
     */
    @JsonProperty("list")
    public java.util.List<forecastresponse.List> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    @JsonProperty("list")
    public void setList(java.util.List<forecastresponse.List> list) {
        this.list = list;
    }

}
