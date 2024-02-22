package cc.iotkit.model.rule;

import cc.iotkit.temporal.es.document.DocTaskLog;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:33+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TaskLogToDocTaskLogMapperImpl implements TaskLogToDocTaskLogMapper {

    @Override
    public DocTaskLog convert(TaskLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DocTaskLog docTaskLog = new DocTaskLog();

        docTaskLog.setId( arg0.getId() );
        docTaskLog.setTaskId( arg0.getTaskId() );
        docTaskLog.setContent( arg0.getContent() );
        docTaskLog.setSuccess( arg0.getSuccess() );
        docTaskLog.setLogAt( arg0.getLogAt() );

        return docTaskLog;
    }

    @Override
    public DocTaskLog convert(TaskLog arg0, DocTaskLog arg1) {
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
