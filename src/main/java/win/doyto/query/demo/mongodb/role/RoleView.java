package win.doyto.query.demo.mongodb.role;

import lombok.Getter;
import lombok.Setter;
import win.doyto.query.mongodb.entity.MongoPersistable;

/**
 * RoleView
 *
 * @author f0rb on 2022/10/26
 */
@Getter
@Setter
public class RoleView extends MongoPersistable<Integer> {
    private String roleName;
    private Boolean valid;
}
