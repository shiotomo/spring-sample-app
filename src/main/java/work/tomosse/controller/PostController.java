package work.tomosse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.val;
import work.tomosse.repository.PostRepository;

@Controller
@RequestMapping("/")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    /**
     * indexメソッド
     *
     * @param mav
     * @return mav
     */
    @GetMapping
    public ModelAndView index(ModelAndView mav) {
        val posts = postRepository.findAll();
        mav.addObject("posts", posts);
        mav.setViewName("post/index");
        return mav;
    }

    /**
     * showメソッド
     *
     * @param mav
     * @return mav
     */
    @GetMapping("post/{id}")
    public ModelAndView show(ModelAndView mav) {
        mav.setViewName("post/show");
        return mav;
    }

    /**
     * newメソッド
     *
     * @param mav
     * @return mav
     */
    @GetMapping("post/new")
    public ModelAndView newPage(ModelAndView mav) {
        mav.setViewName("post/new");
        return mav;
    }

    /**
     * editメソッド
     *
     * @param mav
     * @return mav
     */
    @GetMapping("post/edit/{id}")
    public ModelAndView edit(ModelAndView mav) {
        mav.setViewName("post/show");
        return mav;
    }
}