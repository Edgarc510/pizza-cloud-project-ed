package com.myproject.pizacloudprojected.model;

import com.myproject.pizacloudprojected.enums.Cheese;
import com.myproject.pizacloudprojected.enums.Sauce;
import com.myproject.pizacloudprojected.enums.Topping;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Pizza {

    private UUID id;
    private List<Cheese> cheeseList;
    private List<Sauce> sauceList;
    private List<Topping> toppingList;


}
