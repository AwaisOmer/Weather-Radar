
package forecastsource;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "main",
    "description",
    "icon"
})
public class Weather {

    @JsonProperty("id")
    private int id;
    @JsonProperty("main")
    private String main;
    @JsonProperty("description")
    private String description;
    @JsonProperty("icon")
    private String icon;

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The main
     */
    @JsonProperty("main")
    public String getMain() {
        return main;
    }

    /**
     * 
     * @param main
     *     The main
     */
    @JsonProperty("main")
    public void setMain(String main) {
        this.main = main;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The icon
     */
    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

}
