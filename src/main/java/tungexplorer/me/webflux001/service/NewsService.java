package tungexplorer.me.webflux001.service;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.SynchronousSink;
import tungexplorer.me.webflux001.domain.News;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;

@Service
public class NewsService {
    public Flux<News> getItems() {
        Faker faker = new Faker();

        return Flux.generate((SynchronousSink<News> sink) -> sink.next(new News(faker.food().ingredient(), faker.address().country())))
                .delayElements(Duration.ofSeconds(1L));
    }


}
