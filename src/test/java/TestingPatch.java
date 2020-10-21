import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

public class TestingPatch {

    public static void main(String[] args) throws JsonProcessingException {
        // There is no need to add escape character manually. Just paste string within
        // double
        // quotes. It will automatically add escape sequence as required.


      //basicamente tienes que crear los campos que quieres modificar y mandarlos en el orden
        //por ejemplo firstname y lastname no tienen nodos , pero situviera un nodo tendrias que
        //agregar el nodo y el valor a modificar

        String json2="{\n" +
                "    \"firstname\":\"Grin\",\n" +
                "    \"lastname\" : \"Armstrong\",\r\n" +
                "    \"bookingdates\":{\n" +
                "    \"checkin\": \"2020-05-01\"}\n" +
                "}";


/*
        //GIVEN
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/booking/1")
                .cookie("token", "88c760a9badb691")
                .contentType(ContentType.JSON)
                .body(json2)
                // WHEN
                .when()
                .patch()
                // THEN
                .then()
                .assertThat()
                .statusCode(200)
                .body("firstname", Matchers.equalTo("Grin"))
                .body("lastname", Matchers.equalTo("Armstrong"));*/

        sendinPojo();
    }


    public static void sendinPojo() throws JsonProcessingException {
        BookingPojo booking= new BookingPojo();
      BookingPojo.BookingDates bookdates=new BookingPojo.BookingDates();
        BookingPojo Booking2= new BookingPojo("Este","man",bookdates);
        booking.setFirstname("Grins");
        booking.setLastname("Arrrmstorng");
        bookdates.setCheckin("2020-07-11");
        booking.setBookingdates(bookdates);
        ObjectMapper mapper = new ObjectMapper();
        SimpleBeanPropertyFilter filterPatch= SimpleBeanPropertyFilter
.serializeAllExcept("totalprice","depositpaid","checkout","additionalneeds");
        FilterProvider filters= new SimpleFilterProvider()
                .addFilter("patchFilter",filterPatch);

      //  String jason = mapper.writeValueAsString(booking);
     //   String jason2 = mapper.writeValueAsString(Booking2);
        String jason3=mapper.writer(filters).writeValueAsString(booking);
        System.out.println(Booking2.toString());
       // System.out.println(jason2);
        System.out.println(jason3);

    }

}
