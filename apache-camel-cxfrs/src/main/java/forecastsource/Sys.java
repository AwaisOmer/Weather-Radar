
package forecastsource;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "pod"
})
public class Sys {

    @JsonProperty("pod")
    private String pod;

    /**
     * 
     * @return
     *     The pod
     */
    @JsonProperty("pod")
    public String getPod() {
        return pod;
    }

    /**
     * 
     * @param pod
     *     The pod
     */
    @JsonProperty("pod")
    public void setPod(String pod) {
        this.pod = pod;
    }

}
