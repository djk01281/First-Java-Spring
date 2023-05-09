package com.example.demo.repository;
import java.util.List;
import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Repository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.domain.Data;

@Repository
public class PairMatchingRepository {
    
    private Data data;
    public List<List<String>> getPairs(String level, String mission){
        return data.getData().get(level).get(mission);
    }
    public boolean match(String level, String mission){
        return true;
    }
    public PairMatchingRepository(){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
        String path = System.getProperty("user.dir");
        System.out.print(path);
        this.data = objectMapper.readValue(new File("/workspaces/First-Java-Spring/demo/src/main/java/com/example/demo/db/result.json"), Data.class);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        if(this.data == null){
            this.data = new Data();
        }
    }
}
