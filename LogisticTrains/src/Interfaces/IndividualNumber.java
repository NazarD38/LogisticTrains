package Interfaces;

import java.util.UUID;

public interface IndividualNumber {

    default String generateCarriageNumber(){
        String uuid= UUID.randomUUID().toString().replace("-","");
        return uuid.substring(0,4).toUpperCase();
    }

}
