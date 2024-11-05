package ie.atu.labexam;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {
    private List<Rental> myList= new ArrayList<>();

    public List<Rental> addRental(Rental rental){
        myList.add(rental);
        return myList;
    }


    public List<Rental> updateRental(String rentalCode, Rental urental){
        for (Rental r : myList){
            if (r.getClass().equals(rentalCode)){
                myList.remove(r);
            }
        }
        return myList;
    }

    public List <Rental> deleteRental(String rentalCode ){
        for(Rental r : myList){
            if(r.getClass().equals(rentalCode)){
                myList.remove(r);
            }
        }
        return myList;
    }

}
