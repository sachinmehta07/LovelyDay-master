package xyz.skrawlr.lovelyday.data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PredictionService {
//        @GET("/horoscope/{period}/{sunsign}")
//    @Headers("")
//    Call<ReceivedPrediction> getPrediction(@Path("sunsign") String sunsign, @Path("period") String period);
//    @GET("/horoscope/{period}/{sunsign}")
//    @Headers({
//            "X-RapidAPI-Key: 28814d0b52msh172e29bbde18a20p1eabc5jsne4cc22a6cc5a",
//            "X-RapidAPI-Host: horoscope-astrology.p.rapidapi.com"
//    })
//    Call<ReceivedPrediction> getPrediction(@Path("sunsign") String sunsign, @Path("period") String period);


    @GET("/horoscope")
    Call<ReceivedPrediction> getPrediction(@Query("sunsign") String sunsign, @Query("day") String day);

}
