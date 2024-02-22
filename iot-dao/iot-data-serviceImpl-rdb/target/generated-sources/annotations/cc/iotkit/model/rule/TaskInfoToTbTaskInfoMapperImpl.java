package cc.iotkit.model.rule;

import cc.iotkit.data.model.TbTaskInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TaskInfoToTbTaskInfoMapperImpl implements TaskInfoToTbTaskInfoMapper {

    @Override
    public TbTaskInfo convert(TaskInfo source) {
        if ( source == null ) {
            return null;
        }

        TbTaskInfo tbTaskInfo = new TbTaskInfo();

        tbTaskInfo.setId( source.getId() );
        tbTaskInfo.setName( source.getName() );
        tbTaskInfo.setType( source.getType() );
        tbTaskInfo.setExpression( source.getExpression() );
        tbTaskInfo.setDesc( source.getDesc() );
        tbTaskInfo.setState( source.getState() );
        tbTaskInfo.setUid( source.getUid() );
        tbTaskInfo.setCreateAt( source.getCreateAt() );
        tbTaskInfo.setReason( source.getReason() );

        return tbTaskInfo;
    }

    @Override
    public TbTaskInfo convert(TaskInfo source, TbTaskInfo target) {
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
