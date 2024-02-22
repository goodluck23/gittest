package cc.iotkit.common.thing;

import cc.iotkit.temporal.es.document.DocThingModelMessage;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ThingModelMessageToDocThingModelMessageMapper extends BaseMapper<ThingModelMessage, DocThingModelMessage> {
}
