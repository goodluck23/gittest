package cc.iotkit.data.model;

import cc.iotkit.model.device.DeviceGroup;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbDeviceGroupToDeviceGroupMapper extends BaseMapper<TbDeviceGroup, DeviceGroup> {
}
