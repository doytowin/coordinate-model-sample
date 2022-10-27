package win.doyto.query.demo.domain.perm;

import lombok.Getter;
import lombok.Setter;
import win.doyto.query.entity.Persistable;

import javax.persistence.Id;

/**
 * PermView
 *
 * @author f0rb on 2022/10/26
 * @since 1.0.0
 */
@Getter
@Setter
public class PermView implements Persistable<Integer> {
    @Id
    private Integer id;
    private String permName;
    private Boolean valid;
}