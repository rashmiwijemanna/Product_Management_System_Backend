package edu.icet.service;

import edu.icet.model.dto.ProductDTO;
import edu.icet.model.entity.Product;
import edu.icet.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    private ModelMapper modelMapper=new ModelMapper();

    public List<ProductDTO> getAllProductsDetails(){
        List<Product> all = productRepository.findAll();
        List<ProductDTO>productDTOS=new ArrayList<>();

        for(Product product : all){
            productDTOS.add(modelMapper.map(product,ProductDTO.class));

        }
        return productDTOS;
    }
}
