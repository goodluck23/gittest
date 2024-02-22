package cc.iotkit.model.notify;

import cc.iotkit.data.model.TbChannelConfig;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ChannelConfigToTbChannelConfigMapper extends BaseMapper<ChannelConfig, TbChannelConfig> {
}
