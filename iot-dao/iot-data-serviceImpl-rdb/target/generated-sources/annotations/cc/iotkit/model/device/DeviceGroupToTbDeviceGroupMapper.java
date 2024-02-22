package cc.iotkit.model.device;

import cc.iotkit.data.model.TbDeviceGroup;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface DeviceGroupToTbDeviceGroupMapper extends BaseMapper<DeviceGroup, TbDeviceGroup> {
}
