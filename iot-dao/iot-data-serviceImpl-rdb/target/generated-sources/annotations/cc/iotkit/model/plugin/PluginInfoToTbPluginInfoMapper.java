package cc.iotkit.model.plugin;

import cc.iotkit.data.model.TbPluginInfo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface PluginInfoToTbPluginInfoMapper extends BaseMapper<PluginInfo, TbPluginInfo> {
}
