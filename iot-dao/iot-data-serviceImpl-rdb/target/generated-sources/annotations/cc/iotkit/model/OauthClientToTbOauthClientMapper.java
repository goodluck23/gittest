package cc.iotkit.model;

import cc.iotkit.data.model.TbOauthClient;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface OauthClientToTbOauthClientMapper extends BaseMapper<OauthClient, TbOauthClient> {
}
