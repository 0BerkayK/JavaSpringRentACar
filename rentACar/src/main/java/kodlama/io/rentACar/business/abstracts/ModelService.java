package kodlama.io.rentACar.business.abstracts;
import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.request.CreateModelRequest;
import kodlama.io.rentACar.business.response.GetAllBrandsResponse;
import kodlama.io.rentACar.business.response.GetAllModelsResponse;
import kodlama.io.rentACar.business.response.GetByIdBrandResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();

    void add(CreateModelRequest createModelRequest);
}
