import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = { "intValue" })
public class MyDto {
    @JsonProperty("stringValue")
    private String stringValue;
    private int intValue;
    @JsonProperty("booleanValue")
    private boolean booleanValue;

    public MyDto() {
        super();
        stringValue = "string";
        intValue = 2;
        booleanValue = true;
    }
}
