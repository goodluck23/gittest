package cc.iotkit.temporal.es.document;

import cc.iotkit.model.device.message.DeviceProperty;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface DocDevicePropertyToDevicePropertyMapper extends BaseMapper<DocDeviceProperty, DeviceProperty> {
}
