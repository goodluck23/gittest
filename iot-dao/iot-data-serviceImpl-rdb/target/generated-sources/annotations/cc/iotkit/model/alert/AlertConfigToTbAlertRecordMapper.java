package cc.iotkit.model.alert;

import cc.iotkit.data.model.TbAlertRecord;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface AlertConfigToTbAlertRecordMapper extends BaseMapper<AlertConfig, TbAlertRecord> {
}
