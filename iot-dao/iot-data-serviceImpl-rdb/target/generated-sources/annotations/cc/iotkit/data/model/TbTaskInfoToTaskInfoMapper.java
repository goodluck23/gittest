package cc.iotkit.data.model;

import cc.iotkit.model.rule.TaskInfo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbTaskInfoToTaskInfoMapper extends BaseMapper<TbTaskInfo, TaskInfo> {
  @Mapping(
      target = "actions",
      ignore = true,
      source = "actions"
  )
  TaskInfo convert(TbTaskInfo source);

  @Mapping(
      target = "actions",
      ignore = true,
      source = "actions"
  )
  TaskInfo convert(TbTaskInfo source, @MappingTarget TaskInfo target);
}
