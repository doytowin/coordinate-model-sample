package win.doyto.query.demo.mongodb;

import lombok.SneakyThrows;
import org.bson.BsonArray;
import org.bson.BsonDocument;
import org.bson.conversions.Bson;
import org.junit.jupiter.api.Test;
import org.springframework.util.StreamUtils;
import win.doyto.query.demo.mongodb.perm.PermViewQuery;
import win.doyto.query.demo.mongodb.role.RoleViewQuery;
import win.doyto.query.demo.mongodb.user.UserView;
import win.doyto.query.demo.mongodb.user.UserViewQuery;
import win.doyto.query.mongodb.aggregation.AggregationMetadata;

import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * MongoQueryTest
 *
 * @author f0rb on 2022/10/27
 * @since 1.0.0
 */
class MongoQueryTest {

    @Test
    void should_generate_expected_mongo_query() {

        UserViewQuery userViewQuery = UserViewQuery.builder()
                                                   .rolesQuery(RoleViewQuery.builder().build())
                                                   .permsQuery(PermViewQuery.builder().build())
                                                   .build();
        AggregationMetadata<UserView> md = AggregationMetadata.build(UserView.class, clazz -> null);

        List<Bson> pipeline = md.buildAggregation(userViewQuery);

        List<BsonDocument> result = pipeline.stream().map(Bson::toBsonDocument).collect(Collectors.toList());
        BsonArray expected = BsonArray.parse(readString("/query_user_with_roles_and_perms.json"));
        assertThat(result).isEqualTo(expected);
    }

    @SneakyThrows
    public String readString(String name) {
        return StreamUtils.copyToString(getClass().getResourceAsStream(name), Charset.defaultCharset());
    }

}
