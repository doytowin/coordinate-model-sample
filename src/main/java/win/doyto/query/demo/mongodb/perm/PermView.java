package win.doyto.query.demo.mongodb.perm;

import lombok.Getter;
import lombok.Setter;
import win.doyto.query.mongodb.entity.MongoPersistable;

/**
 * PermView
 *
 * @author f0rb on 2022/10/26
 * @since 1.0.0
 */
@Getter
@Setter
public class PermView extends MongoPersistable<Integer> {
    private String permName;
    private Boolean valid;
}