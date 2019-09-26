package com.company;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class HttpURLConnectionExample {

    private static final String USER_AGENT = "Mozilla/5.0";

    private static final String GET_URL = "https://api.exchangeratesapi.io/latest?symbols=USD,GBP,RON";

    private static final String POST_URL = "http://localhost:9090/SpringMVCExample/home";

    private static final String POST_PARAMS = "userName=Pankaj";

    public static void main(String[] args) throws Exception {

        sendGET();
        System.out.println("GET DONE");

    }

    public static void sendGET() throws Exception {
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();


            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);

            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }

    }
}



