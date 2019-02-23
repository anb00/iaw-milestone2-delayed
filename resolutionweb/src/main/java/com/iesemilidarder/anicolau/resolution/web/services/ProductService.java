package com.iesemilidarder.anicolau.resolution.web.services;


import com.iesemilidarder.anicolau.resolution.core.data.Product;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product getProductByIdRest(Integer id);

    Product findById(UUID id);

    Product index(String gohome); //Arreglar que retorne a index, detalles del producto y borrar produto o modificar!

    Product saveProduct(Product product);

    Product deleteProduct(Product product);

    //Product deleteProduct2(Product product);

    //Product deleteProductX(Integer id);
    //Todo review: void delete(T entity);


}

