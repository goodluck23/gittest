package cc.iotkit.model.rule;

import cc.iotkit.data.model.TbTaskInfo;
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
public interface TaskInfoToTbTaskInfoMapper extends BaseMapper<TaskInfo, TbTaskInfo> {
  @Mapping(
      target = "actions",
      ignore = true,
      source = "actions"
  )
  TbTaskInfo convert(TaskInfo source);

  @Mapping(
      target = "actions",
      ignore = true,
      source = "actions"
  )
  TbTaskInfo convert(TaskInfo source, @MappingTarget TbTaskInfo target);
}
