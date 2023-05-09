package com.example.demo.domain;
import java.util.List;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    @JsonProperty("data")
    private HashMap<String, HashMap<String, List<List<String>>>> data;
    public HashMap<String, HashMap<String, List<List<String>>>> getData(){
        return data;
    }
    public void setData(HashMap<String, HashMap<String, List<List<String>>>> data){
        this.data = data;
    }
 
    public List<List<String>> getPairs(String level, String mission){
        return data.get(level).get(mission);
    }
}
