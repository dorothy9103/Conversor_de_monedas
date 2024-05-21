public class ConsultaDivisa {

    public Divisa buscaDivisa(String divisa1, String divisa2, double cantidad){
        java.net.URI direccion = java.net.URI.create("https://v6.exchangerate-api.com/v6/159dfe0a164fb93d8c71f784/pair/"+divisa1 + "/" + divisa2 + "/" + cantidad);

        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            java.net.http.HttpResponse<String> response = client
                    .send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            return new com.google.gson.Gson().fromJson(response.body(), Divisa.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa opción.");
        }
    }
}
