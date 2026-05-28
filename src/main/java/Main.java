package org.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<String,String> user = new HashMap<>();
        user.put("name","Meenakshi");
        user.put("technology","Maven & Java");
        user.put("status","Learning");
        Gson gson = new Gson();
        String jsonResult = gson.toJson(user);
        System.out.println("-----Maven Gson Dependency Output-----");
        System.out.println(jsonResult);

    }
}
