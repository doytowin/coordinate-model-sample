package win.doyto.query.demo.mongodb.user;

import lombok.Getter;
import lombok.Setter;
import win.doyto.query.annotation.DomainPath;
import win.doyto.query.demo.mongodb.perm.PermView;
import win.doyto.query.demo.mongodb.role.RoleView;
import win.doyto.query.mongodb.entity.MongoPersistable;

import java.util.List;

/**
 * UserView
 *
 * @author f0rb on 2022/10/27
 * @since 1.0.0
 */

@Getter
@Setter
public class UserView extends MongoPersistable<Long> {
    private String username;

    // many-to-many
    @DomainPath({"user", "role"})
    private List<RoleView> roles;

    // many-to-many
    @DomainPath({"user", "role", "perm"})
    private List<PermView> perms;
}
