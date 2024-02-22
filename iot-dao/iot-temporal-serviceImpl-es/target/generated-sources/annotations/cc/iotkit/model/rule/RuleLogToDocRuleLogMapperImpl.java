package cc.iotkit.model.rule;

import cc.iotkit.temporal.es.document.DocRuleLog;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:34+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class RuleLogToDocRuleLogMapperImpl implements RuleLogToDocRuleLogMapper {

    @Override
    public DocRuleLog convert(RuleLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DocRuleLog docRuleLog = new DocRuleLog();

        docRuleLog.setId( arg0.getId() );
        docRuleLog.setRuleId( arg0.getRuleId() );
        docRuleLog.setState( arg0.getState() );
        docRuleLog.setContent( arg0.getContent() );
        docRuleLog.setSuccess( arg0.getSuccess() );
        docRuleLog.setLogAt( arg0.getLogAt() );

        return docRuleLog;
    }

    @Override
    public DocRuleLog convert(RuleLog arg0, DocRuleLog arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setRuleId( arg0.getRuleId() );
        arg1.setState( arg0.getState() );
        arg1.setContent( arg0.getContent() );
        arg1.setSuccess( arg0.getSuccess() );
        arg1.setLogAt( arg0.getLogAt() );

        return arg1;
    }
}
