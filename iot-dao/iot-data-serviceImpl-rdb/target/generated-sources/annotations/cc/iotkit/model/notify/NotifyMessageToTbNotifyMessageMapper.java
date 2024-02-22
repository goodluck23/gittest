package cc.iotkit.model.notify;

import cc.iotkit.data.model.TbNotifyMessage;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface NotifyMessageToTbNotifyMessageMapper extends BaseMapper<NotifyMessage, TbNotifyMessage> {
}
