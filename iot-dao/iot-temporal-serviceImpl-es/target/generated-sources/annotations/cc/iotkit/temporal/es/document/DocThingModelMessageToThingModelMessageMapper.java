package cc.iotkit.temporal.es.document;

import cc.iotkit.common.thing.ThingModelMessage;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface DocThingModelMessageToThingModelMessageMapper extends BaseMapper<DocThingModelMessage, ThingModelMessage> {
}
