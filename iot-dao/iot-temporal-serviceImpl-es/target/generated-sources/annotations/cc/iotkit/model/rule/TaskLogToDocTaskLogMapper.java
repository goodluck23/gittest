package cc.iotkit.model.rule;

import cc.iotkit.temporal.es.document.DocTaskLog;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TaskLogToDocTaskLogMapper extends BaseMapper<TaskLog, DocTaskLog> {
}
