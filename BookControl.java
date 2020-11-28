package edu.poly.spring.controls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.poly.spring.models.Book;
import edu.poly.spring.services.BookService;

@Controller
@RequestMapping("/backend/book")
public class BookControl {
	@Autowired
	private BookService bookService;
	@GetMapping("/add")
	public String add(ModelMap model) {
		model.addAttribute("book",new Book());
		return "/backend/book/add";
	}
	
	@PostMapping("/save")
	public String save(ModelMap model, Book book) {
		bookService.save(book);
		model.addAttribute(book);
		return list(model);
	}
	
	@GetMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name = "id") String id) {
		Optional<Book> opt = bookService.findById(id);
		if(opt.isPresent()) {
			model.addAttribute("book",opt.get());
		}else {
			return list(model);
		}
		return "/backend/book/edit";
	}
	
	@PostMapping("/update")
	public String update(Book book,ModelMap model) {
		bookService.save(book);
		model.addAttribute(book);
		return "backend/book/list";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(ModelMap model,@PathVariable(name = "id")String id) {
		bookService.deleteById(id);
		return list(model);
	}
	
	@RequestMapping("/list")
	public String list(ModelMap model) {
		List<Book> list= (List<Book>) bookService.findAll();
		model.addAttribute("books",list);
		return "/backend/book/list";
	}
	
	@RequestMapping("/find")
	public String find(ModelMap model, @RequestParam (defaultValue = "") String name) {
		List<Book> list = bookService.findByNameLikeOrderByName(name);
		model.addAttribute("books",list);
		return "backend/book/list";
	}
}
