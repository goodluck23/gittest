package cc.iotkit.model.space;

import cc.iotkit.data.model.TbHome;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface HomeToTbHomeMapper extends BaseMapper<Home, TbHome> {
}
