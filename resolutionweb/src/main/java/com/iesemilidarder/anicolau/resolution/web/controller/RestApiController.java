package com.iesemilidarder.anicolau.resolution.web.controller;//package com.iesemilidarder.anicolau.resolution.web.controller;

import com.iesemilidarder.anicolau.resolution.core.DataHelper;
import com.iesemilidarder.anicolau.resolution.core.data.Country;
import com.iesemilidarder.anicolau.resolution.core.data.Product;
import com.iesemilidarder.anicolau.resolution.core.data.Restaurant;
import com.iesemilidarder.anicolau.resolution.web.service.CallMeService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api/rest")
public class RestApiController {

    @Autowired
    CallMeService callService;




    @RequestMapping("/add")
    public Product addProduct(
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam String img,
            @RequestParam Double price
    ) {
        Product product = new Restaurant();
        product.setName(name);
        product.setDescription(description);
        product.setImgUri(img);
        product.setPrecio(price);
        DataHelper.addItem(product);
        return product;
    }

    @RequestMapping("/find")
    public Product findById(@RequestParam String uuid, Session session) {
        Product product = DataHelper.getItemById(UUID.fromString(uuid));
        if (product==null){
            return new Restaurant();
        }
        return product;
    }

    @RequestMapping("/getAll")
    public List<Product> getAll( Session session) {
        return DataHelper.getItems();
    }

    @RequestMapping("/pruebas")
    public List<Product> init( Session session) {
        return init(session);
    }




}
