package tungexplorer.me.webflux001.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class News {
    private String title;
    private String description;
}
