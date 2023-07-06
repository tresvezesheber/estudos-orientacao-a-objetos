package apiArquivosErros;

import apiArquivosErros.excecao.ErroDeConversaoDeAnoException;
import apiArquivosErros.model.Titulo;
import apiArquivosErros.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um título de filme para a busca: ");
        var busca = leitura.nextLine();
        String endereco = "https://omdbapi.com/?apikey=7150e3ff&t=" + busca.replace(" ", "+");

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

//        Gson gson = new Gson();
//        Titulo titulo = gson.fromJson(json, Titulo.class);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);

            System.out.println("TítuloOMDB: " + tituloOmdb);

            Titulo titulo = null;

            titulo = new Titulo(tituloOmdb);
            System.out.println("Título (Objeto): " + titulo);
        } catch (NumberFormatException e) {
            System.out.println("Houve um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no argumento de busca!");
            System.out.println(e.getMessage());
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }


    }
}
