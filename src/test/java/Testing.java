

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Testing {


    public static void main(String args[]) throws IOException {




        UsersPojo user = new UsersPojo();
        DataPojo data = new DataPojo();
        DataPojo data2 = new DataPojo();
       /// DataPojo data2 = new DataPojo(1,2,3,"","");
        AddClass add = new AddClass();
        List<DataPojo> list = new ArrayList<DataPojo>();

        user.setPage(3);
        user.setPer_page(6);
        user.setTotal(12);
        user.setTotal_pages(8);
        data.setId(1);
        data.setName("kjhjh");
        data.setYear(1995);
        data.setColor("blue");
        data.setPantone_value("String");
        data2.setId(2);
        data2.setName("objetodos");
        data2.setYear(1996);
        data2.setColor("bludde");
        data2.setPantone_value("Strinddg");

        list.add(data);
        list.add(data2);
        user.setData(list);
        add.setCompany("Company");
        add.setText("texto");
        add.setUrl("ustshjhasfkjaskdh");
        user.setAd(add);
        ObjectMapper mapper = new ObjectMapper();
//serialization
       String jason = mapper.writeValueAsString(user);
       System.out.println(jason);

       //deserialization
        String jsonString="{ \"page\": 1,    \"per_page\": 6,    \"total\": 12,    \"total_pages\": 2,    \"data\": [        {            \"id\": 1,            \"name\": \"cerulean\",            \"year\": 2000,           \"color\": \"#98B2D1\",            \"pantone_value\": \"15-4020\"        },        {            \"id\": 2,            \"name\": \"fuchsia rose\",            \"year\": 2001,            \"color\": \"#C74375\",            \"pantone_value\": \"17-2031\"        },        {            \"id\": 3,            \"name\": \"true red\",            \"year\": 2002,            \"color\": \"#BF1932\",            \"pantone_value\": \"19-1664\"        },        {            \"id\": 4,            \"name\": \"aqua sky\",           \"year\": 2003,            \"color\": \"#7BC4C4\",            \"pantone_value\": \"14-4811\"        },        {            \"id\": 5,            \"name\": \"tigerlily\",            \"year\": 2004,            \"color\": \"#E2583E\",            \"pantone_value\": \"17-1456\"        },        {            \"id\": 6,            \"name\": \"blue turquoise\",            \"year\": 2005,            \"color\": \"#53B0AE\",            \"pantone_value\": \"15-5217\"      }    ],    \"ad\": {        \"company\": \"StatusCode Weekly\",        \"url\": \"http://statuscode.org/\",        \"text\": \"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.\"   }}";
       mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
       UsersPojo userspo= mapper.readValue(jsonString, UsersPojo.class);
       AddClass jhy=new AddClass();
       jhy=userspo.getAd();

      List<DataPojo> data2r4 = new ArrayList<DataPojo>();

      data2r4=userspo.getData();
      DataPojo testing = data2r4.get(1);
         //     data2r4.add();
System.out.println( userspo.getData().indexOf(1));


    }
}
