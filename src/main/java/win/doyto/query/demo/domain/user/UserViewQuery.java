package win.doyto.query.demo.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import win.doyto.query.core.PageQuery;
import win.doyto.query.core.RelationalQuery;
import win.doyto.query.demo.domain.perm.PermViewQuery;
import win.doyto.query.demo.domain.role.RoleViewQuery;

/**
 * UserViewQuery
 *
 * @author f0rb on 2022/10/26
 * @since 1.0.0
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserViewQuery extends PageQuery implements RelationalQuery<UserView, Long> {

    private RoleViewQuery rolesQuery;

    private PermViewQuery permsQuery;

    @Override
    public Class<UserView> getDomainClass() {
        return UserView.class;
    }
}
