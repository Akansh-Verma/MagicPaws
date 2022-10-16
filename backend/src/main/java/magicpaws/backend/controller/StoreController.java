package magicpaws.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import magicpaws.backend.model.Store;
import magicpaws.backend.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {
    
    @Autowired
    StoreService storeService;

    @PostMapping("/add")
    public String addProduct(@RequestBody Store store)
    {
        StoreService.addProduct(store);
        return "New Product added";
    }
}
