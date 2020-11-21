package tungexplorer.me.webflux001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import tungexplorer.me.webflux001.domain.News;
import tungexplorer.me.webflux001.service.NewsService;

@RestController
public class HelloWorldController {
    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/all-news", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<News> getAll() {
        var result = newsService.getItems();
        System.out.println(123);
        return result;
    }
}
