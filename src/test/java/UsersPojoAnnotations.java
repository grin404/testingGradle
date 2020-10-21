import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class UsersPojoAnnotations {
    @JsonProperty("page")
    int page;
    @JsonProperty("per_page")
    int per_page;
    @JsonProperty("total")
    int total;
    @JsonProperty("total_pages")
    int total_pages;
    @JsonProperty("data")
    List<DataPojo> data;
    @JsonGetter("page")
    public int getPage() {
        return page;
    }
    @JsonProperty("page")
    public void setPage(int page) {
        this.page = page;
    }
    @JsonGetter("per_page")
    public int getPer_page() {
        return per_page;
    }
    @JsonSetter("per_page")
    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }
    @JsonGetter("total")
    public int getTotal() {
        return total;
    }
    @JsonSetter("total")
    public void setTotal(int total) {
        this.total = total;
    }
    @JsonGetter("total_pages")
    public int getTotal_pages() {
        return total_pages;
    }
    @JsonSetter("total_pages")
    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }
    @JsonGetter("data")
    public List<DataPojo> getData() {
        return data;
    }
    @JsonSetter("data")
    public void setData(List<DataPojo> data) {
        this.data = data;
    }
}
