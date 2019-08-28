package com.example.MatPro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class ProductController {


//    @Autowired
//    PoductRepository vr;

    @Autowired
    private ProdRepository repo;

    @Autowired
    private OrderHasProductRepository orderrepo;

    @Autowired
    private CustomerOrderRepository custrepo;

    @Autowired
    private AddressRepository addressrepo;

    @Autowired
    private CustomertelephoneRepository telephonerepo;

    @Autowired
    private PaymentinfoRepository paymentrepo;

    @Autowired
    private ProcurementRepository procurementrepo;

    @Autowired
    private procurementhasproductRepository procurementproductrepo;

    @Autowired
    private SuppliertelephoneRepository suppliertelephonerepo;

    @Autowired
    private SupplierRepository supplierrepo;

    @Autowired
    private CustomerRepository customerrepo;

//    @GetMapping("/")
//    public String getHomepage(Model model) {
//
//            List<Product> allProducts = vr.getAllProducts();
//            model.addAttribute("allProducts", allProducts);
//            return "Test";
//    }


    @GetMapping("/")
    public String test(Model model) {

        List<Product> allProducts = (List<Product>)repo.findAll();
        model.addAttribute("allProducts", allProducts);
        return "Test";
    }

    @GetMapping("/warehouse")
    public String post (Model model) {
        List<Product> allProducts = (List<Product>)repo.findAll();
        model.addAttribute("allProducts", allProducts);
        List<Customerorder> customer = (List<Customerorder>)custrepo.findAll();
        model.addAttribute("customer", customer);
        List<Orderhasproduct> orderprod = (List<Orderhasproduct>)orderrepo.findAll();
        model.addAttribute("orderprod", orderprod);
        return "HandleStock";
    }

    @PostMapping("/warehouse")
    public String post (Model model, @RequestParam String searchBar) {
        List<Product> allProducts = repo.findAllByName(searchBar);
        //Customerorder customer;
        List<Customerorder> customerOrderList = new ArrayList<>();
        List<Orderhasproduct> orderprod = new ArrayList<>();

            for (int i=0;i<allProducts.size();i++) {
                orderprod.add(orderrepo.findById(allProducts.get(i).getProductno()).get());
            }

        for (int i=0;i<orderprod.size();i++) {
            customerOrderList.add(custrepo.findById(orderprod.get(i).getOrderid()).get());
        }


        model.addAttribute("orderprod", orderprod);
        model.addAttribute("allProducts", allProducts);
        model.addAttribute("customer", customerOrderList);
        return "HandleStock";
    }

//    @GetMapping("/id")
//    public String id(Model model) {
//
//        Integer a=1;
//        Product allProducts = (Product)repo.findAllById(a);
//        model.addAttribute("allProducts", allProducts);
//        return "Test";
//    }

}
