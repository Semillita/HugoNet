package io.semillita.hugonet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class PostController {

	private List<Post> posts;

	public PostController() {
		posts = new ArrayList<>();
	}

	@PostMapping("/post/{description}")
	public Post postImage(@PathVariable(value = "description") final String description) {
		final long ID = posts.size();
		final Post post = new Post(description, ID);
		posts.add(post);
		return post;
	}

	@GetMapping("/post/{ID}")
	public Post getPost(@PathVariable(value = "ID") final long ID) {
		return posts.get((int) ID);
	}

}
