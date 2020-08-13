package com.dxctraining.ui;
import com.dxctraining.entities.*;
import com.dxctraining.exception.*;
import com.dxctraining.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component

public class ItemUi {
	@Autowired
    private IItemService service;


    @PostConstruct
    public void runUi(){
        try {
            Item item1 = new Item("yasaswini");
            Item item2 = new Item("sahithi");
            item1 = service.save(item1);
            item2 = service.save(item2);

            int id1 = item1.getId();
            Item fetched1 = service.findItemById(id1);
            System.out.println("fetcehd employee =" + fetched1.getId()+" "+fetched1.getName());

            
            
        }catch (ItemNotFoundException e){
            e.printStackTrace();
        }

        catch (InvalidArgumentException e){
            e.printStackTrace();
        }
    }



}


