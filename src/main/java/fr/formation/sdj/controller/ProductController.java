package fr.formation.sdj.controller;

import fr.formation.sdj.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/")
    public String home(final ModelMap model) {
        model.put("productList", productRepository.findAll());
        return "home";
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}