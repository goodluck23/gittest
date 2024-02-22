package cc.iotkit.data.model;

import cc.iotkit.model.rule.TaskInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbTaskInfoToTaskInfoMapperImpl implements TbTaskInfoToTaskInfoMapper {

    @Override
    public TaskInfo convert(TbTaskInfo source) {
        if ( source == null ) {
            return null;
        }

        TaskInfo taskInfo = new TaskInfo();

        taskInfo.setId( source.getId() );
        taskInfo.setName( source.getName() );
        taskInfo.setType( source.getType() );
        taskInfo.setExpression( source.getExpression() );
        taskInfo.setDesc( source.getDesc() );
        taskInfo.setState( source.getState() );
        taskInfo.setUid( source.getUid() );
        taskInfo.setCreateAt( source.getCreateAt() );
        taskInfo.setReason( source.getReason() );

        return taskInfo;
    }

    @Override
    public TaskInfo convert(TbTaskInfo source, TaskInfo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setName( source.getName() );
        target.setType( source.getType() );
        target.setExpression( source.getExpression() );
        target.setDesc( source.getDesc() );
        target.setState( source.getState() );
        target.setUid( source.getUid() );
        target.setCreateAt( source.getCreateAt() );
        target.setReason( source.getReason() );

        return target;
    }
}
