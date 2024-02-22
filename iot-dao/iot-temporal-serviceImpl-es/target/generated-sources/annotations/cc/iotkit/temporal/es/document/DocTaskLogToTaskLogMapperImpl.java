package cc.iotkit.temporal.es.document;

import cc.iotkit.model.rule.TaskLog;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:34+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DocTaskLogToTaskLogMapperImpl implements DocTaskLogToTaskLogMapper {

    @Override
    public TaskLog convert(DocTaskLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TaskLog taskLog = new TaskLog();

        taskLog.setId( arg0.getId() );
        taskLog.setTaskId( arg0.getTaskId() );
        taskLog.setContent( arg0.getContent() );
        taskLog.setSuccess( arg0.getSuccess() );
        taskLog.setLogAt( arg0.getLogAt() );

        return taskLog;
    }

    @Override
    public TaskLog convert(DocTaskLog arg0, TaskLog arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setTaskId( arg0.getTaskId() );
        arg1.setContent( arg0.getContent() );
        arg1.setSuccess( arg0.getSuccess() );
        arg1.setLogAt( arg0.getLogAt() );

        return arg1;
    }
}
