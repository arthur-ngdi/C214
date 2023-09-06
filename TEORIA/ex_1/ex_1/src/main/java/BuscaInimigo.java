import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo{

    InimigoService inimigoService;

    public BuscaInimigo(InimigoService inimigoService) {
        this.inimigoService = inimigoService;
    }

    public Inimigo buscaInimigo(int id){

        String inimigoJson = inimigoService.busca(id);

        JsonObject JsonObject = JsonParser.parseString(inimigoJson).getAsJsonObject();

        return new Inimigo(JsonObject.get("nome").getAsString(),
                JsonObject.get("qtdvida").getAsDouble(),
                JsonObject.get("arma").getAsString());
    }
}
