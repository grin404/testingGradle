import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FeeWaiverService {


    public void deserializeJasonInput(LoanConsumer objFeewaiver){

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

         String jsonString = gson.toJson(objFeewaiver);

       LoanConsumer empObject = gson.fromJson(jsonString, LoanConsumer.class);
       System.out.println(empObject);
    }


    public void serializePOJO(String jsonObj){


        Gson gson = new Gson();

        LoanConsumer empObject = gson.fromJson(jsonObj, LoanConsumer.class);

        System.out.println(empObject);

    }
}
