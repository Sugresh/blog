public class BlogPost {
    private String title;
    private String content;
    private String author;
    private Date date;

    // Constructors, getters, setters, etc.
}
@RestController
public class BlogController {

    private List<BlogPost> blogPosts = new ArrayList<>();

    @GetMapping("/blog")
    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    @PostMapping("/blog")
    public void addBlogPost(@RequestBody BlogPost blogPost) {
        blogPosts.add(blogPost);
    }
}
@SpringBootApplication
public class BlogPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogPlatformApplication.class, args);
    }
}