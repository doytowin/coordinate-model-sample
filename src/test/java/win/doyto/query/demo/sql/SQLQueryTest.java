package win.doyto.query.demo.sql;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import win.doyto.query.core.DataQueryClient;
import win.doyto.query.demo.domain.perm.PermViewQuery;
import win.doyto.query.demo.domain.role.RoleViewQuery;
import win.doyto.query.demo.domain.user.UserView;
import win.doyto.query.demo.domain.user.UserViewQuery;

import java.util.List;
import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SQLQueryTest {

    @Resource
    private DataQueryClient userQueryClient;

    @Test
    void should_query_the_user_list_with_roles_and_perms() {

        UserViewQuery userViewQuery = UserViewQuery.builder()
                                                   .rolesQuery(RoleViewQuery.builder().build())
                                                   .permsQuery(PermViewQuery.builder().build())
                                                   .build();

        List<UserView> userViews = userQueryClient.query(userViewQuery, UserView.class);

        assertThat(userViews).hasSize(3);
        UserView user1 = userViews.get(0);
        assertThat(user1.getRoles()).hasSize(1);
        assertThat(user1.getPerms()).hasSize(4);

    }

}
