package cc.iotkit.model.device.message;

import cc.iotkit.temporal.es.document.DocDeviceProperty;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface DevicePropertyToDocDevicePropertyMapper extends BaseMapper<DeviceProperty, DocDeviceProperty> {
}
