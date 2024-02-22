package cc.iotkit.temporal.es.document;

import cc.iotkit.model.device.VirtualDeviceLog;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface DocVirtualDeviceLogToVirtualDeviceLogMapper extends BaseMapper<DocVirtualDeviceLog, VirtualDeviceLog> {
}
