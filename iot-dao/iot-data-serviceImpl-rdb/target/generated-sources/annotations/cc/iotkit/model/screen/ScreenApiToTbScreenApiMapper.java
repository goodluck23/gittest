package cc.iotkit.model.screen;

import cc.iotkit.data.model.TbScreenApi;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ScreenApiToTbScreenApiMapper extends BaseMapper<ScreenApi, TbScreenApi> {
}
