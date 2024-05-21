public class GeneradorDeArchivo {
    public void guardarJson(Divisa moneda) throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
        java.io.FileWriter escritura = new java.io.FileWriter(moneda.conversion_result()+".json");
        escritura.write(gson.toJson(moneda));
        escritura.close();
    }
}
