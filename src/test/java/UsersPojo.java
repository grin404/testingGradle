import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class UsersPojo {

    int page;
    int per_page;
    int total;
    int total_pages;
    List<DataPojo> data;
    AddClass ad;


    public UsersPojo(){}
    public UsersPojo(int page, int per_page, int total, int total_pages, List<DataPojo> data, AddClass ad) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
        this.ad = ad;
    }

    public AddClass getAd() {
        return ad;
    }

    public void setAd(AddClass ad) {
        this.ad = ad;
    }

    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getPer_page() {
        return per_page;
    }
    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getTotal_pages() {
        return total_pages;
    }
    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }
    public List<DataPojo> getData() {
        return data;
    }
    public void setData(List<DataPojo> data) {
        this.data = data;
    }
}
