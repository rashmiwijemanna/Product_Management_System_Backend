package edu.icet.controller;

import edu.icet.model.dto.ProductDTO;
import edu.icet.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public void add(@RequestBody ProductDTO productDTO){
        productService.add(productDTO);
    }

    @GetMapping("/getAll")
    public List<ProductDTO> getAll(){
       return productService.getAllProductsDetails();
    }

}
