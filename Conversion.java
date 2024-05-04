//import java.lang.Object;
import java.lang.InterruptedException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

public class Conversion {
	private double valor;
	private String from, to;

	Conversion() {}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setParametrosConversion(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public String realizarConversion() throws IOException, InterruptedException {
		String apikey = "19a2d0b7ad67be589e861cf1";
		String url = "https://v6.exchangerate-api.com/v6/" + apikey + "/pair/" + from + "/" + to + "/" + valor;

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		String json = response.body();
		Gson gson = new Gson();
		Moneda moneda = gson.fromJson(json, Moneda.class);

		return "El valor " + valor + " [" + from + "] corresponde al valor final de " + moneda.getConversion() + " [" + to + "]";
	}
}