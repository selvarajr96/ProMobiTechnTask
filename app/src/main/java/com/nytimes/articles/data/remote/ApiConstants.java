package com.nytimes.articles.data.remote;


/**
 * Keep all the service related constants here.
 * Author: Selvaraj R
 * Email: selvarajr96@gmail.com
 * Created: 27-apr-2019
 * Modified: 27-apr-2019
 */
public class ApiConstants {
    public static final String BASE_URL = "https://api.nytimes.com/";
    public static final long CONNECT_TIMEOUT = 30000;
    public static final long READ_TIMEOUT = 30000;
    public static final long WRITE_TIMEOUT = 30000;
    public static final String API_KEY = "sNuGoxM9jmOsAUe4sIP4EmNGeg9yNjkT";

    private ApiConstants(){
        // Private constructor to hide the implicit one
    }

}
