package Gson;

import com.google.gson.annotations.SerializedName;

public class Query {
    @SerializedName(value = "Num")
   public String number;
    @SerializedName(value = "indentiefier")
    public String ind;
    @SerializedName(value = "title")
     public String title;
    @SerializedName(value = "description")
    public String descr;


    @Override
    public String toString() {
        return "Query{" +
                "number='" + number + '\'' +
                ", ind='" + ind + '\'' +
                ", title='" + title + '\'' +
                ", descr='" + descr + '\'' +
                '}';
    }
}
