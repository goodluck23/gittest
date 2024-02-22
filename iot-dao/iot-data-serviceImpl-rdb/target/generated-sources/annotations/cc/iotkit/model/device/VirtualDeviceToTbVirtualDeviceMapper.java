package cc.iotkit.model.device;

import cc.iotkit.data.model.TbVirtualDevice;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface VirtualDeviceToTbVirtualDeviceMapper extends BaseMapper<VirtualDevice, TbVirtualDevice> {
}
