package com.example.Meteora.salesDirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.values.AccountantName;

public class SalesDirectorCreated extends DomainEvent {

    //Constructor
    //Between parentesis is a property that will transport from one place to another
    public SalesDirectorCreated(){
        //it brings a type, the domain is meteora, accountantcreated is the specific type
        super("meteora.accountant.accountantcreated");
    }

    //Get LOOK FOR A SHORCUT!
    //Flat Object, it's not an entity, it's only to transport objects like a DTO

}