package ro.OLibrary.Library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.OLibrary.Library.repositories.BookRepository;

@Controller
public class bookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/books")
    public String books(Model model){
        model.addAttribute("books",bookRepository.findAll());
        return "books";
    }
}
