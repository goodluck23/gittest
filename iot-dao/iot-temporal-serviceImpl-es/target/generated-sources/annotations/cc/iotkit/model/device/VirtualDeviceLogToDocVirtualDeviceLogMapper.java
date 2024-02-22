package cc.iotkit.model.device;

import cc.iotkit.temporal.es.document.DocVirtualDeviceLog;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface VirtualDeviceLogToDocVirtualDeviceLogMapper extends BaseMapper<VirtualDeviceLog, DocVirtualDeviceLog> {
}
