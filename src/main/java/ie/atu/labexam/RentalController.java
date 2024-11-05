package ie.atu.labexam;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/Rental")

public class RentalController {

    private ProductService myservice;

    public RentalController(ProductService myservice){
        this.myservice= myservice;
    }

    private List<Rental> list = new ArrayList();

    @GetMapping
    public List <Rental> getRental (){
        return list;

    }

    @Autowired
    private ProductService productService;

    @PutMapping("/{rentalCode}")
    public ResponseEntity<List<Rental>> updateRental(@PathVariable String rentalCode, @RequestBody Rental urental ){
        List<Rental> updatedList= productService.deleteRental(rentalCode);
        return ResponseEntity.ok(updatedList);

    }

    @DeleteMapping("/{rentalCode")
    public ResponseEntity<List<Rental>>deleteRental(@PathVariable String rentalCode){
        List<Rental>updatedList = productService.deleteRental(rentalCode);
        return ResponseEntity.ok(updatedList);
    }

    @PostMapping
    public List<Rental> newRental (@RequestBody @Valid Rental rental ){
        list = myservice.addRental(rental);
        return list;

    }









}
