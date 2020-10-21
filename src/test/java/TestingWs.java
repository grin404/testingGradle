import com.google.gson.Gson;

import java.io.FileWriter;

public class TestingWs

{

    public static void main (String args[]){
/*
        String harcodeado="esta hardcodeado";
        String var="diferente";

        if(harcodeado.equals(var)){

            System.out.println("igual");
        }else{
            System.out.println(harcodeado.length());
            System.out.println(var.length());
        }*/
   /* Gson gson=new Gson();
    LoanConsumer loanConsumer =new LoanConsumer();
        gson.toJson(loanConsumer, new FileWriter(""));
        String loan2= gson.toJson(loanConsumer);*/

       String loan=  "{'id':1001, 'firstName':'JOe', 'lastName':'Doe', 'workstream':'Mortgage'}";
        FeeWaiverService fws=new  FeeWaiverService();
        fws.serializePOJO(loan);
        LoanConsumer newCons= new LoanConsumer(5600,"juan","perez","workstream");
        fws.deserializeJasonInput(newCons);


    }
}
