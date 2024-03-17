package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.antlr.v4.runtime.Token;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models.ProductOrder;

import java.lang.reflect.Type;
import java.util.List;

public class ConvertJson {
    private Gson gson ;

    public ConvertJson() {
        this.gson =  new Gson();;
    }

    public ProductOrder convertJsonToObject(String json){
        return gson.fromJson(json, ProductOrder.class);
    }
    public String convertObjectToJson(ProductOrder productOrder){
        return gson.toJson(productOrder);
    }
    public List<ProductOrder> convertJsonToListObject(String json){
        Type listType = new TypeToken<List<ProductOrder>>(){}.getType();
        return gson.fromJson(json,listType);
    }

    public String convertListObjectToJson(List<ProductOrder> productOrders){
        return gson.toJson(productOrders);
    }
}
