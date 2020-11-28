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

import edu.poly.spring.models.Poster;
import edu.poly.spring.services.PosterService;

@Controller
@RequestMapping("/backend/poster")
public class PosterControl {
	@Autowired
	private PosterService posterService;

	@GetMapping("/add")
	public String add(ModelMap model) {
		model.addAttribute("poster", new Poster());
		return "backend/poster/add";
	}

	@PostMapping("/save")
	public String save(ModelMap model, Poster poster) {
		posterService.save(poster);
		model.addAttribute(poster);
		return list(model);
	}

	@GetMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name = "id") String id) {
		Optional<Poster> opt = posterService.findById(id);
		if (opt.isPresent()) {
			model.addAttribute("poster", opt.get());
		} else {
			return list(model);
		}
		return "backend/poster/edit";
	}

	@PostMapping("/update")
	public String update(Poster poster, ModelMap model) {
		posterService.save(poster);
		model.addAttribute(poster);
		return "backend/poster/list";
	}

	@PostMapping("/delete/{id}")
	public String delete(ModelMap model, @PathVariable(name = "id") String id) {
		posterService.deleteById(id);
		return list(model);
	}

	@RequestMapping("/list")
	public String list(ModelMap model) {
		List<Poster> list = (List<Poster>) posterService.findAll();
		model.addAttribute("posters", list);
		return "backend/posters/list";
	}

	@RequestMapping("/find")
	public String find(ModelMap model, @RequestParam(defaultValue = "") String name) {
		List<Poster> list = posterService.findByNameLikeOrderByName(name);
		model.addAttribute("posters", list);
		return "backend/poster/list";
	}
}
