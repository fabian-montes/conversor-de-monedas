import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("conversion_result")
    private double conversion;
    
    Moneda() {}
    public double getConversion() {
        return conversion;
    }
}