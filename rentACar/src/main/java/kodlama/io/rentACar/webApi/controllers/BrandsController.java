package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.request.UpdateBrandRequest;
import kodlama.io.rentACar.business.response.GetAllBrandsResponse;
import kodlama.io.rentACar.business.response.GetByIdBrandResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModalMapperManager;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

    private BrandService brandService;

    @GetMapping()
    public List<GetAllBrandsResponse> getAll(){

        return brandService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdBrandResponse getById (@PathVariable int id){

        return brandService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add( @RequestBody() @Valid() CreateBrandRequest createBrandRequest){

        this.brandService.add(createBrandRequest);
    }

    @PutMapping()

    public void update( @RequestBody UpdateBrandRequest updateBrandRequest){
            this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id ){
        this.brandService.delete(id);
    }
}
